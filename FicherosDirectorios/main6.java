package FicherosDirectorios;

import java.io.*;

public class main6 {
    public static void main(String[] args){
        //lee datos
        //entrada esel flujo de datos, el tunel por odnde iran los datos

        try{
            FileReader entrada = new FileReader("C:" + File.separator + "Users" + File.separator + "Luxero" + File.separator + "Documents" + File.separator + "Intellij IDEA projects" + File.separator + "CarpetaDePrueba" + File.separator + "cosa1.txt");
            //nos devuelve el numero correspondiente al caracter UNICODE o -1 si esta en el final

            int caracter = entrada.read();
            char letra = (char) caracter;

            while(caracter != -1){
                //la variable caracter tiene el numero UNICOE correspondiente a cada letra

                System.out.print(letra);
                caracter = entrada.read();
                letra = (char) caracter;
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
