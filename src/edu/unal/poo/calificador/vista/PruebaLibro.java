package edu.unal.poo.calificador.vista;
import java.util.Scanner;
import edu.unal.poo.calificador.modelo.*;

/**
 *
 * @author Daniel
 */

public class PruebaLibro {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Nombre Autor");
        String nombre= teclado.next();
        
        //Dependencia
        Autor autor= new Autor(nombre,"Garcia","123456789");
        Libro libro = new Libro("Cien annios de Soledad",300);
        //asociando el libro con el autor
        libro.setAutor(autor);
        //
        String autorLibro = libro.getAutor().getNombre();
    }
}
