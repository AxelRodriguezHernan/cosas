package FicherosDirectorios;
import java.io.*;
public class main8 {
    public static void main(String[] args){
        //usando un buffer para leer un archivo
    try{
        FileReader entrada = new FileReader("C:" + File.separator + "Users" + File.separator + "Luxero" + File.separator + "Documents" + File.separator + "Intellij IDEA projects" + File.separator + "CarpetaDePrueba" + File.separator + "cosa1.txt");
        BufferedReader miBuffer = new BufferedReader(entrada);
        String linea = "";

        while(linea != null){
            linea = miBuffer.readLine();
            System.out.println(linea);

        }
        entrada.close();

    }catch(Exception e ){
        e.printStackTrace();
    }
    }
}
