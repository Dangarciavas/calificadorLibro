package edu.unal.poo.calificador.modelo;

/**
 *
 * @author Daniel
 */
public class ConjuntoLibro {
    
    //Asociacion
    private Libro[] libros;
    
    public ConjuntoLibro(){
        this.libros = new Libro[20];    
    }
    
    public boolean anadirLibro(Libro libro){
        int posVacio= -1;
        for (int i = 0; i < 20; i++) {
                if(this.libros[i]==null){
                posVacio=i;
                break;
                }
        }
        if(posVacio!=-1){
            this.libros[posVacio]=libro;
            return true; 
        }
        else return false;

        
    public Libro[] mostrarLibros(){
        return.this.libros;
    }
    
    }
}
