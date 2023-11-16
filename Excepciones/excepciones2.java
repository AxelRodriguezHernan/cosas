package Excepciones;
import java.util.Scanner;
import java.util.InputMismatchException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class excepciones2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner leer = new Scanner(System.in);

        try {
            realizarDivision();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("ingreso un valor que no va");
            /*
             * e.printStackTrace sirve para que veamos el error
             */
            System.out.println("ERROR!");
            e.printStackTrace();  //imprimer los mensajes rojos en la consola
        }

        System.out.println("Fin del programa");
    }

    /*
     * el metodo que lleva la clasusula throws es el metodo que es suseptible de producir errores
     * Si la excepci�n es NO CONTROLADA throw no nos obliga a capturar la escepci�n pero si la excepci�n es CONTROLADA
     * al colocar throw en el metodo cuando lo llamemos deveremos capturar la excepci�n.
     */

    static void realizarDivision() throws InputMismatchException{

        Scanner leer = new Scanner(System.in);

        System.out.println("ingresa un n�mero");
        int nroUno = leer.nextInt();

        System.out.println("ingresa otro n�mero");
        int nroDos = leer.nextInt();

        int resultado = nroUno / nroDos;
        System.out.println("el resultado es "+resultado);

    }

}