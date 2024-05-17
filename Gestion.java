
import java.util.*;

public class Gestion {
    private List<Estudiante> listaEstudiantes;

    public Gestion() {
            listaEstudiantes = new ArrayList<Estudiante>();
    }
    
    public List<Estudiante>getEstudiante(){
        return listaEstudiantes;
    }
    
    public void setEstudiante(List<Estudiante>newlistaEstudiantes){
        this.listaEstudiantes=newlistaEstudiantes;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
        System.out.println("Estudiante agregado correctamente.");
    }

    public void listarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de Estudiantes:");
            for (Estudiante estudiante : listaEstudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    public void buscarEstudiante(int numeroEstudiante) {
        boolean encontrado = false;
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCodigo() == numeroEstudiante) {
                System.out.println("Estudiante encontrado:");
                System.out.println(estudiante);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public static void main(String[] args) {
        Gestion registro = new Gestion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante por Número de Estudiante");
            System.out.println("4. Salir del Programa");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    registro.listarEstudiantes();
                    break;
                case 3:
                    System.out.print("Ingrese número de estudiante a buscar: ");
                    int numBuscar = scanner.nextInt();
                    registro.buscarEstudiante(numBuscar);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 4);
    }
}
