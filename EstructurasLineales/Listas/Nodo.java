package EstructurasLineales.Listas;

public class Nodo {
        private String valor;
        private Nodo siguiente;

        public Nodo(String valor){
            this.valor = valor;
            this.siguiente = null;
        }

        @Override
        public String toString() {
            return this.valor;
        }

        public void enlazarSiguiente(Nodo n){
            this.siguiente = n;
        }

        public Nodo getSiguiente(){
            return this.siguiente;
        }

    }

