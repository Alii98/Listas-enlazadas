
package edu.utim.ticsi4b;

import java.util.Scanner;

/**
 * Created by Alicia Flores on 23/10/2017.
 */
public class SimpleList{
    Scanner sc = new Scanner(System.in);
    private Nodo primero;
    private int tamanio;

    public void lista(){
        primero=null;
        tamanio=0;
    }

    public void  insertar(Object valor){
        System.out.println("¿Cuantos datos desea ingresar?");
        int datos = sc.nextInt();
        for (int i=0; i<datos; i++){
            System.out.println("Ingresa tu valor");

            String v = sc.next();
        }


    }

    public void agregarAlInicio(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            primero = nuevo;
            // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(primero);
            // Renombra al nuevo nodo como el inicio de la lista.
            primero = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }

    private boolean esVacia() {
        return primero==null;
    }



    public boolean buscar(int referencia){

        boolean VEncontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al final de la lista.
        while(primero != null && VEncontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == primero.getValor()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                primero = primero.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }

    public int getTamanio(){
        return tamanio;
    }

    public void ShowList( ) {
        return;
    }
