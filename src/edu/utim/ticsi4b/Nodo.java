package edu.utim.ticsi4b;

/**
 * Created by Alicia Flores on 25/10/2017.
 */
public class Nodo {
    Object Datos;
    Nodo  siguiente;

    public Nodo (Object valor){
        this.Datos=Datos;
        this.siguiente=null;

    }
    public Object obtenerValor(){
        return Datos;
    }
    public void enlazarSiguiente (Nodo n){
        siguiente=n;
    }
    public Nodo obtenerSiguiente() {
        return siguiente;
    }


    public Nodo getSiguiente() {
        return siguiente;
    }
}



