class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private int codigo;

    public Estudiante(String nombre, String apellido, int edad, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String newNombre){
        this.nombre= newNombre;
    }
    
    public void setApellido(String newApellido){
        this.apellido= newApellido;
    }
    
    public void setEdad(int newEdad){
        this.edad= newEdad;
    }
    
    public void setCodigo(int newCodigo){
        this.codigo= newCodigo;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Número de Estudiante: " + codigo;
    }
}

