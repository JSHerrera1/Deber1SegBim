public abstract class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private int numeroFaltas;

    public Persona(String nombre, int edad, String sexo, int numeroAsistencias) {
        this.nombre = nombre;
        
        if (this.edad <= 60) {
            this.edad = edad;
        } else {
            System.out.println("La edad limite para estudiar sobrepasa los 60 años");
            System.exit(0);
        }
        
        this.sexo = sexo;
        this.numeroFaltas = numeroAsistencias;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }
    
    public abstract int comprobarAsistencia();
}
