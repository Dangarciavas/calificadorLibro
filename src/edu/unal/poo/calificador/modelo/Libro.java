/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.calificador.modelo;

/**
 *
 * @author Estudiante
 */
public class Libro {
    
    private String titulo;
    private int numeroPaginas;
    private int calificacion;
    
    //Asociacion: Cardinalidad 0...1 o 1
    private Autor autor;

    public Libro(String titulo, int numeroPaginas) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
}
