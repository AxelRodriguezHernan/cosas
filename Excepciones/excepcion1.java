package Excepciones;

import java.util.Scanner;

public class excepcion1 {

    public static void main(String[] args){


        System.out.println("ingresa un número");
        Scanner leer = new Scanner(System.in);
        int nroUno = 0;
        int nroDos = 0;
        /*
         * Si en vez de n�meros se ingresa letras se producir� una RuntimeException
         * RuntimeException es una Excepciones no comprobada y DEBEN SER PREVISTAS POR EL PROGRAMADOR.
         */
       try{
           try {

               nroUno = leer.nextInt();
               System.out.println("ingresa otro número");
               nroDos = leer.nextInt();

           }catch(Exception e){
               System.out.println("Solo se aceptan valores enteros");
               System.exit(0); //para finalizar el programa y que no ejecute lo que sigue.
           }

           int resultado = nroUno / nroDos;
           System.out.println(resultado);

       }catch(ArithmeticException e){
           System.out.println("no pudimos "+ e.getMessage()); //getMessage() devuelde un string detallando la informacion del objeto tipo throwable exception
       }


        System.out.println("Fin del programa");
    }
}
