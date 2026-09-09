package Ejercicio4;
import java.util.Scanner;

public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Ingrese datos del Libro ---");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Libro libro1 = new Libro(titulo, autor, paginas);
        Libro libro2 = new Libro(); // Usando constructor por defecto

        System.out.println("\n--- Ingrese datos de la Cuenta Bancaria ---");
        System.out.print("Número de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        CuentaBancaria cuenta1 = new CuentaBancaria(numCuenta, saldo);
        CuentaBancaria cuenta2 = new CuentaBancaria(); // Usando constructor por defecto

        System.out.println("\n--- Ingrese datos del Estudiante ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        Estudiante estudiante1 = new Estudiante(nombre, edad, curso);
        Estudiante estudiante2 = new Estudiante(); // Usando constructor por defecto

        System.out.println("\n=== RESULTADOS FINALES ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(estudiante1);
        System.out.println(estudiante2);

        scanner.close();
    }
}