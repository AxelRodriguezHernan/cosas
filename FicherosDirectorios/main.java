package FicherosDirectorios;

import java.io.*;

public class main {
    public static void main(String[] args){
    File archivo = new File("TutorialDeJavaEE.iml");

    System.out.println("Ruta: " + archivo.getAbsoluteFile());   //Nos muestras la ruta absoluta del archivo pero segun el proyecto
    System.out.println("Ruta: " + archivo.exists());            //nos informa si un archivo existe o no


}

}
