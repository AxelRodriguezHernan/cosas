package EstructurasLineales.Listas;

public class NodoDoble {
        private String valor;
        private EstructurasLineales.Listas.NodoDoble siguiente;
        private EstructurasLineales.Listas.NodoDoble anterior;

        public NodoDoble(String valor){
            this.valor = valor;
            this.siguiente = null;
            this.anterior = null;
        }

        public String toString(){
            return this.valor;
        }
    }

