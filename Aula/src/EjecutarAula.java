
import java.util.ArrayList;
import java.util.Arrays;

public class EjecutarAula {
    public static void main(String[] args) {
        Materia materia1 = new Materia("Matemáticas");
        Materia materia2 = new Materia("Filosofía");
        Materia materia3 = new Materia("Física");
        
        Estudiante estudiante1 = new Estudiante("Juan Pablo", 25, "Masculino", 2, 9);
        Estudiante estudiante2 = new Estudiante("Blass Daniel", 24, "Masculino", 1, 5);
        Estudiante estudiante3 = new Estudiante("Juan Diego", 25, "Masculino", 0, 7);
        Estudiante estudiante4 = new Estudiante("Carolina", 15, "Femenino", 1, 9);
        
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        
        listaEstudiantes.add(0, estudiante1);
        listaEstudiantes.add(1, estudiante2);
        listaEstudiantes.add(2, estudiante3);
        listaEstudiantes.add(3, estudiante4);
        
        Profesor profesor1 = new Profesor("Hugo Llanos", 50, "Masculino", 2, materia3);
        Profesor profesor2 = new Profesor("Diana Velasquez", 35, "Femenino", 1, materia2);
        
        Aula aula = new Aula("11050", listaEstudiantes, profesor1, 5, materia3);
        
        System.out.println("Bienvenido al aula de " + aula.getMateria().getNombre() + "\n");
        
        if (aula.estadoAula()) {
            System.out.println("Estado: Se puede dar clases\n");
            aula.mostrarAlumnosAprobados();
        } else {
            System.out.println("Estado: No se puede dar clases");
        }
    }
}
