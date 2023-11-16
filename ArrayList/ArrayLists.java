//los ArrayList son como los arreglos tradicionales. Poseen indices para identificar los elementos y solo se agregan elementos al final del ArrayList

package ArrayList;
//se deben importar las listas para poder instanciar objetos
//existen varios tipos de listas, como el arraylist o el linkedlist
import java.util.List;
import java.util.ArrayList;

public class ArrayLists{
    public static void main(String[] args){

        List<Persona> lista = new ArrayList<Persona>();
        //se puede agreagr elementos a la lista usando dos linea de codigo, pero una osla es mas eficiente
        //Persona perso1 = new Persona("42985811", 38, "juan perez");
        // lista.add(perso1);

        lista.add(new Persona("1", 38, "juan perez"));
        lista.add(new Persona("2",45,"garbiel lopez"));
        lista.add(new Persona("3",13,"ana arco"));
        lista.add(new Persona("4",22,"lucia gomez"));




        //recorrer por indice, usa mas codigo pero puede acceder a un objeto determina sabiendo su posicion en el arraylist
        for(int i = 0 ; i < lista.size(); i++ ){
            System.out.println("Prueba: "+ lista.get(i).getNombre()); //get(i) trae el elemento almacenado en el indice indicado
        }

        System.out.println("\n----------------------------------");

        //recorrer con for-each, se usa menos codigo pero reccorre una por una
        // por cada objeto Persona llamada perso(variable axuliar) que este dentro de la lista
        for (Persona perso: lista){
            System.out.println("Prueba: " + perso.getNombre());
        }

        System.out.println("\n----------------------------------");

        //remove en ArrayList. Se pasa el indice del elemento a eliminar
        lista.remove(0);

        for (Persona perso: lista){
            System.out.println("Prueba: " + perso.getNombre());
        }


        /*metodos compatibles para ArrayList y LinkedList
        .size() = da el tamaño de la lista
        .isEmpty() = devuelve false si no esta vacia y true si tiene algun registro

        (solo para LinkedList)  .getFirst().toString()
                                .getLast().toString()   //getFirst()/getLast() trae la direccion de memoria del objeto. Se usa el metodotoString(), el cual esta en la clase Persona,
                                                        // para pasar la informacion del objeto a formato String

        */




    }
}
