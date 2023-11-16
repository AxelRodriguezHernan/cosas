package FicherosDirectorios;

import hashCodeEqual.Usuario;

import java.io.*;
public class main2 {
     public static void main(String[] args){

         //examina todo lo que hay en un directorio

        File carpeta = new File("C:\\Users\\Luxero\\Documents\\Intellij IDEA projects\\CarpetaDePrueba");
        String[] nombres = carpeta.list();

        //lista todos los elementos de la carpeta

         for(int i = 0; i < nombres.length ; i++){

            System.out.println(nombres[i]);

            //si queremos ver tambien los archivos dentro del directorio hijo

             File f = new File(carpeta.getAbsolutePath(), nombres[i]);

             if(f.isDirectory()){
                 String [] nombresEnSubcarpeta = f.list();
                 for(int j = 0; j < nombresEnSubcarpeta.length ; j++){
                     System.out.println("-> "+ nombres[i]);
                 }
             }
         }

     }
}
