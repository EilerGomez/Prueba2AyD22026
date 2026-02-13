package org.example;
import java.util.*;
public class Utilidades {

    //de la base de dats
    public static void imprimirBD(Hashtable<Student, List<Course>> bd) {
        for (Map.Entry<Student, List<Course>> entry : bd.entrySet()) {
            Student e = entry.getKey();
            List<Course> cursos = entry.getValue();

            imprimirTupla(e.getId(),e.getNombre(),e.getApellido(),cursos);
        }
    }

    public static void imprimirTupla(int idEstudiante, String nombreEstudiante, String apellidoEstudiante, List<Course> cursos){
        System.out.println("Id: " + idEstudiante + "| Nombre: " + nombreEstudiante + "| Aoellido " + apellidoEstudiante + "| Cursos -> " + cursos);
    }


    // del curso
    public static List<Course> insertarCursoSinDuplicar(List<Course> base, List<Course> extra) {
        Set<Course> set = new LinkedHashSet<>();
        set.addAll(base);
        set.addAll(extra);
        return new ArrayList<>(set);
    }

    public static List<Course> SinDuplicado(List<Course> cursos) {
        return new ArrayList<>(new LinkedHashSet<>(cursos));
    }

    // de los estudiantyes
    public static Student  buscarPorApellido(Set<Student> estudiantes, String apellido){
        for (Student e: estudiantes){
            if (e.getApellido().equalsIgnoreCase(apellido)){
                return e;
            }
        }
        return null;
    }

    public static Student buscarPorId(List<Student> estudiantes, int id){
        for (Student e:estudiantes){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    public static Course buscarCursoPorApellido()


}
