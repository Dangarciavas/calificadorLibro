/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.calificador.vista;
import java.util.Scanner;
import edu.unal.poo.calificador.modelo.Autor;
import edu.unal.poo.calificador.modelo.Libro;
/**
 *
 * @author Estudiante
 */

public class PruebaLibro {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Nombre Autor");
        String nombre= teclado.next();
        
        //Dependencia
        Autor autor= new Autor(nombre,"Gir","245712");
        Libro libro = new Libro("Cien annios de Soledad",300);
        //asociando el libro con el autor
        libro.setAutor(autor);
        //
        String autorLibro = libro.getAutor().getNombre();
    }
}
