package Ejercicio3;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado";
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Emanuel", 17, "Ingeniería de Software");
        System.out.println("Ejecutando sin problemas");
    }
}