import java.net.URL;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;;

public class ControlGestion {
    private Gestion gestion = new Gestion();
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblNombre;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtCodigo;

    @FXML
    private Button btnAgregar;

    @FXML
    private TextField txtBuscar;

    @FXML
    private Button btnlistarEstudiantes;

    @FXML
    private Label lblApellido;

    @FXML
    private TextField txtNombre;

    @FXML
    private Label lblBuscar;

    @FXML
    private TextArea txtResultados;

    @FXML
    private TextArea txtlistaEstudiantes;

    @FXML
    private Label lblEdad;

    @FXML
    private TextField txtApellido;

    @FXML
    private Label lblCodigo;

    @FXML
    private Button btnBuscar;

    @FXML
    private Label lblResultados;

    @FXML
    void addEstudiante(ActionEvent event) {
        
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            int edad=0;
            try {edad = Integer.parseInt(txtEdad.getText());
            }catch (NumberFormatException e) {
                txtEdad.setText("Formato invalido");}
            int codigo=0;
            try{codigo = Integer.parseInt(txtCodigo.getText());
            }catch (NumberFormatException e) {
                txtCodigo.setText("Formato invalido");}
                
            if (edad!=0 && codigo!=0){
            Estudiante estudiante = new Estudiante(nombre, apellido, edad, codigo);
            gestion.agregarEstudiante(estudiante);

            txtNombre.clear();
            txtApellido.clear();
            txtEdad.clear();
            txtCodigo.clear();
            
            }
    }

    @FXML
    void buscarEstudiante(ActionEvent event) {
        try {
            int codigo = Integer.parseInt(txtBuscar.getText());
            boolean encontrado = false;
            txtResultados.clear();
            for (Estudiante estudiante : gestion.getEstudiante()) {
                if (estudiante.getCodigo() == codigo) {
                    txtResultados.setText(estudiante.toString());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                txtResultados.setText("Estudiante no encontrado.");
            }
        } catch (NumberFormatException e) {
            // Manejar el error de formato numérico
            txtResultados.setText("Error: El código debe ser un número.");
        }
    }

    @FXML
    void listarEstudiantes(ActionEvent event) {
        txtlistaEstudiantes.clear();
        if (gestion.listaEstudiantes.isEmpty()) {
            txtlistaEstudiantes.setText("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : gestion.listaEstudiantes) {
                txtlistaEstudiantes.appendText(estudiante.toString() + "\n");
            }
        }
    }

    @FXML
    void initialize() {
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert txtBuscar != null : "fx:id=\"txtBuscar\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert btnlistarEstudiantes != null : "fx:id=\"btnlistarEstudiantes\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert lblApellido != null : "fx:id=\"lblApellido\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert lblBuscar != null : "fx:id=\"lblBuscar\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert txtResultados != null : "fx:id=\"txtResultados\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert txtlistaEstudiantes != null : "fx:id=\"txtlistaEstudiantes\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert lblCodigo != null : "fx:id=\"lblCodigo\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        assert lblResultados != null : "fx:id=\"lblResultados\" was not injected: check your FXML file 'GestionEstudiantes.fxml'.";
        
        txtEdad.setOnMouseClicked(event -> txtEdad.clear());
        txtCodigo.setOnMouseClicked(event -> txtCodigo.clear());
    }
}
