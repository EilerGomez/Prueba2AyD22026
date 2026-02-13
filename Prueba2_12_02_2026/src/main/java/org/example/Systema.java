package org.example;

import  java.util.*;
public class Systema {
    //base de datos <estudiante, lista de cursos>

    private final Hashtable<Student,List<Course>> bd = new Hashtable<>();

    public void agregarEstudiante(){

    }
    public void imprimirEstudiantesCursos(){
        Utilidades.imprimirBD(bd);
    }

    public int totalEstudiantes(){
        return bd.size();
    }

    public List<Course> obtenerCursosDeEstudiante(Student e) {
    }

    public Student obtenerEstudiantePorId(int id) {
    }

    public List<Course> obtenerCursosPorIdEstudiante(int id) {
    }

    public List<Course> obtenerCursosPorApellidoEstudiante(String apellido) {
    }
}
