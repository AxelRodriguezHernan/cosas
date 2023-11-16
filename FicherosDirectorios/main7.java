package FicherosDirectorios;

import java.io.*;

public class main7 {
    public static void main(String[] args){
        //escritura
        String texto = "esto se escribio en el archivo desde el programa";
        try{
            FileWriter escritura = new FileWriter("C:" + File.separator + "Users" + File.separator + "Luxero" + File.separator + "Documents" + File.separator + "Intellij IDEA projects" + File.separator + "CarpetaDePrueba" + File.separator + "cosa1.txt");
            //para escribir recorremos caracter a caracterel String y lo escribimos en el archivo

            for(int i = 0; i < texto.length() ; i++){
                //escribe letra por letra en el archivo
                escritura.write(texto.charAt(i));
            }
            escritura.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
