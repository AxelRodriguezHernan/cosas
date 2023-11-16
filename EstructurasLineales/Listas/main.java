package EstructurasLineales.Listas;

public class main {

        public static void main (String[] args){

            Nodo primerNodo = new Nodo("1");
            Nodo segundoNodo = new Nodo("2");
            Nodo tercerNodo = new Nodo("3");

            //se enlaza primer nodo al segundo
            primerNodo.enlazarSiguiente(segundoNodo);
            //se enlaza segundo nodo al tercero
            primerNodo.getSiguiente().enlazarSiguiente(tercerNodo);

    }
}
