public class Profesor extends Persona {
    private Materia materia;

    public Profesor() {
    }

    public Profesor(String nombre, int edad, String sexo, int numeroAsistencias, Materia materia) {
        super(nombre, edad, sexo, numeroAsistencias);
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    @Override
    public int comprobarAsistencia() {
        int limiteAsistencia = 8;
        
        int porcentaje = (getNumeroFaltas() / limiteAsistencia) * 100;
        
        return porcentaje;
    }
}
