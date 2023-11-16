package FicherosDirectorios;
import java.io.*;
public class main3 {
    public static void main(String[] args){
        /*usamos File.separator para colocar el separador compatible  con el sistema operativo  y asi hacer
        compatible el programa con otros sistemas operativos
        */

        File carpeta = new File("C:" + File.separator + "Users" + File.separator + "Luxero" + File.separator + "Documents" + File.separator + "Intellij IDEA projects" + File.separator + "CarpetaDePrueba");
    }
}
