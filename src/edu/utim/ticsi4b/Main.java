package edu.utim.ticsi4b;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String opcion;
        do{
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que desea hacer?");
        System.out.println("1 Insertar \n 2 Mostrar \n 3 Buscar \n 4 ELiminar \n 5 Contar \n 6 Terminar");
         opcion = sc.nextLine();

        switch (opcion) {
            case "1": {
                SimpleList list = new SimpleList();
                list.insertar(list);


            }
            case "2": {

                break;

            }
            case "3": {


                break;
            }
            case "4": {

                break;
            }
            case "5": {
                SimpleList lista = new SimpleList();




                break;
            }
            case "6": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Opción incorrecta");
                break;
            }

        }
        }while (!opcion.equals("6"));
    }


}
