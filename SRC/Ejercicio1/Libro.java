package Ejercicio1;

public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
        this.titulo = "Sin titulo";
        this.autor = "Anonimo";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 467);
        libro2.mostrarDetalles();
    }
}