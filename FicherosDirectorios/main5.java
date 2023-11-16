package FicherosDirectorios;

import java.io.*;
import java.util.*;

public class main5 {
    public static void main(String[] args){
        //creando archivo y poniendole contenido

        Scanner scan = new Scanner(System.in);

        System.out.println("Contenido: ");
        String frase = scan.nextLine();

        String nombreCarpeta = "nombreCarpeta";
        String nombreArchivo = "nombreArchivo";

        try{
            FileWriter contenidoDelArchivo = new FileWriter("C:" + File.separator + "Users" + File.separator + "Luxero" + File.separator + "Documents" + File.separator + "Intellij IDEA projects" + File.separator + "CarpetaDePrueba" + File.separator + nombreCarpeta + File.separator + nombreArchivo + ".txt", true);
            contenidoDelArchivo.write(frase.toString());
            contenidoDelArchivo.close();

        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
