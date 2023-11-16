//las LinkedList no poseen indices, solo poseen principip, medio y final. Se pueden agregar elementos al comienzo o al final del LinkedList
//es como una cadena donde los elelementos del medio se conectan al elemento anterior y siguiente

package ArrayList;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists{
    public static void main(String[] args){
        //declaracion es identica a la de array list
        List<Persona> lista = new LinkedList<Persona>();


        lista.add(new Persona("1", 38, "juan perez"));
        lista.add(new Persona("2",45,"garbiel lopez"));
        lista.add(new Persona("3",13,"ana arco"));
        lista.add(new Persona("4",22,"lucia gomez"));

        //las LinkedList no tienen un indice defininido coomo las ArrayList
        /*
        for(int i = 0 ; i < lista.size(); i++ ){
            System.out.print("Prueba: "+ lista.get(i).getNombre());
        }
        System.out.println("----------------------------------");
        */

        //los ArrayList solo permiten agregar elementos al final de la lista
        //los LinkedList permiten agregar elementos al principio y final de la lista


        //se agrega nuevo elemento al principio agreando el indice 0 al comienzo

        lista.add(0, new Persona("5", 17, "fulano de tal"));


        for (Persona perso: lista){
            System.out.println("Prueba: " + perso.getNombre());
        }

        //remove en LinkedList. Se pasa directamente el elemento que se quiera eliminar
        String nombreBorrar = "fulano de tal";
        for(Persona perso: lista){
            if(perso.getNombre() == nombreBorrar){
                lista.remove(perso);
                break; // cada elemento se conecta a su siguiente y anterior. Al eliminar un elemento, se genera un error pues java no sabe
                       // cual elemento siggue. Usar break para salir del bucle y darle tiempo a java a reorganizar el LinkedList
            }
        }






    }
}
