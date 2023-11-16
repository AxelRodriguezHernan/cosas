package EstructurasLineales.Listas;

public class Nodo2 {


    static class Node{
        private int valor;      //data contenida en el nodo
        private Node siguiente; //puntero al siguiente elemento de un nodo

        private Node head;  //primer elemento de la lista
        private Node tail;  //ultimo elemento de la lista


        public Node(int valor){
            this.valor = valor;
            this.siguiente = null;
        }


        public void agregarElementoFinal(Node x){
            //si la cabeza no existe y la lista esta vacia, agega el nuevo valor como la cabeza
            Node n = head;
            if(n == null){
                head = x;
                tail = x;
                return;
            }

            //si la lista no esta vacia, recorre cada elemento hasta llegar al ultimo y agrega el nuevo valor como el ultimo
            while(n.siguiente != null){
                n = n.siguiente;
            }
            n.siguiente = x;
            head = head.siguiente;
        }

        public void agregarElementoIndice(Node x, int idx){
            Node n = head; //n es variable aux para luego pode inciar un conteo desde el principio de la lista
            if(n==null){
                head = x;
                return;
            }

            for(int i = 0; i < idx-1 ; i++){
                n = n.siguiente;
            }
            x.siguiente = n;
        }

        public void eliminarElementofinal(){
            if(tail==null){
                return;
            }

            Node n = head;
            while(n.siguiente != tail){
                n = n.siguiente;
            }
            tail = n;
            n.siguiente = null; //se desenlaza de la lista el elemento que uno quiere que el garbage collector elimine
        }

    }
}
