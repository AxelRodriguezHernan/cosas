package EstructurasLineales.Listas.LinkedList;

public class NodoDoble {
        public NodoDoble siguiente;
        public NodoDoble anterior;
        public String valor;

        public NodoDoble(String valor){
            this.valor = valor;
            this.siguiente = null;
            this.anterior = null;
        }

        public String toString(){
            return this.valor;
        }

}
