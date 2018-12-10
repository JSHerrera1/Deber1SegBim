import java.util.ArrayList;
import java.util.Arrays;

public class Aula {
    private String idAula;
    private ArrayList<Estudiante> listaEstudiantes;
    private Profesor profesor;
    private int numeroMaximoEstudiantes;
    private Materia materia;

    public Aula(String idAula, ArrayList<Estudiante> listaEstudiantes, Profesor profesor, int numeroMaximoEstudiantes, Materia materia) {
        this.idAula = idAula;
        this.listaEstudiantes = listaEstudiantes;
        this.profesor = profesor;
        this.numeroMaximoEstudiantes = numeroMaximoEstudiantes;
        this.materia = materia;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public int getNumeroMaximoEstudiantes() {
        return numeroMaximoEstudiantes;
    }

    public void setNumeroMaximoEstudiantes(int numeroMaximoEstudiantes) {
        this.numeroMaximoEstudiantes = numeroMaximoEstudiantes;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    public boolean estadoAula() {       
        int porcentaje = (listaEstudiantes.size() / getNumeroMaximoEstudiantes()) * 100;
        
        if ((profesor.getMateria().getNombre().equals(getMateria().getNombre())) && porcentaje <= 50) {
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarAlumnosAprobados() {
        int estudiantesMasculinos = 0, estudiantesFemeninos = 0;
        
        System.out.println("Nombre\t\t% Asistencias   Nota");
        
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            System.out.println(listaEstudiantes.get(i).getNombre() + "\t\t" + listaEstudiantes.get(i).comprobarAsistencia() + "\t" + listaEstudiantes.get(i).getCalificacionActual());
            int comprobarAsistencia = listaEstudiantes.get(i).comprobarAsistencia();
            
            if (listaEstudiantes.get(i).comprobarAsistencia() >= 50 && listaEstudiantes.get(i).getCalificacionActual() >= 6) {
                if (listaEstudiantes.get(i).getSexo().equals("Masculino")) {
                    estudiantesMasculinos++;
                }
            
                if (listaEstudiantes.get(i).getSexo().equals("Femenino")) {
                    estudiantesFemeninos++;
                }
            }
        }
        
        System.out.println("\nHay " + estudiantesMasculinos + " estudiantes masculinos aprobados");
        System.out.println("Hay " + estudiantesFemeninos + " estudiantes femeninos aprobados");
    }
}
