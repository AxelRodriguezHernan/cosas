package FicherosDirectorios;
import java.io.*;

public class main4 {
    public static void main(String[] args){
        //creando una carpeta
        //al colocar en el final el nombre del directorio que queremos crear  y luego mkdir creamos el directorio

        File carpeta = new  File("C:" + File.separator + "Users" + File.separator + "Luxero" + File.separator + "Documents" + File.separator + "Intellij IDEA projects" + File.separator + "CarpetaDePrueba" + File.separator + "carpetaCreada");
        carpeta.mkdir();
    }
}
