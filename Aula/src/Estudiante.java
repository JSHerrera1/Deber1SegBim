public class Estudiante extends Persona {
    private double calificacionActual;

    public Estudiante(String nombre, int edad, String sexo, int numeroAsistencias, double calificacionActual) {
        super(nombre, edad, sexo, numeroAsistencias);
        
        if (this.calificacionActual >= 0 && this.calificacionActual <= 10) {
            this.calificacionActual = calificacionActual;
        } else {
            System.out.println("La calificacion actual es menor a 0 o es mayor a 10");
            System.exit(0);
        }
    }

    public double getCalificacionActual() {
        return calificacionActual;
    }

    public void setCalificacionActual(double calificacionActual) {
        this.calificacionActual = calificacionActual;
    }
    
    @Override
    public int comprobarAsistencia() {
        int limiteAsistencia = 8; // 8 clases en total
        int porcentaje = 0;
        
        if (getNumeroFaltas() == 0) {
            return 100;
        } else {
            porcentaje =(limiteAsistencia / getNumeroFaltas()) * 10;
        }
        
        return porcentaje;
    }
}
