import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.awt.event.*;

public class ControlGestion {

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

    }

    @FXML
    void buscarEstudiante(ActionEvent event) {

    }

    @FXML
    void listarEstudiantes(ActionEvent event) {

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

    }
}
