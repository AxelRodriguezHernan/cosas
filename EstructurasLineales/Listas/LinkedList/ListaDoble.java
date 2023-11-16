package EstructurasLineales.Listas.LinkedList;

public class ListaDoble {
    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tamano;

    public ListaDoble(){
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

    public boolean vacia(){
        return this.primero == null;
    }

    public void agregar(String valor){
        NodoDoble nodoNuevo = new NodoDoble(valor);
        if(vacia()){
            this.primero = nodoNuevo;
            this.ultimo = nodoNuevo;
        }else{
            NodoDoble aux = this.primero;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            //asigna primero y ultimo;
            aux.siguiente = nodoNuevo;
            nodoNuevo.anterior = aux;
            this.ultimo = nodoNuevo;
        }
        tamano++;
    }

    public void agregarInicio(String valor){
        NodoDoble nodoNuevo = new NodoDoble(valor);

        if(vacia()){
            this.primero = nodoNuevo;
        }else{
            nodoNuevo.siguiente = this.primero;
            this.primero.anterior = nodoNuevo;
            this.primero = nodoNuevo;
        }
        tamano++;
    }

    public void eliminarUltimo(){
        if(vacia()){
            System.out.println("lista vacia");
        }else{
            NodoDoble aux = this.primero;
            NodoDoble nodoAnterior = aux;

            while(aux.siguiente != null){
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces hago primero y ultimo null para indicar que la lista esta vacia.

            if(aux == this.primero){
                this.primero = null;
                this.ultimo = null;
            }else{
                this.ultimo = nodoAnterior;
                nodoAnterior.siguiente = null;
                aux.anterior = null;
            }
        }
        tamano--;
    }

    public void imprimir(){
        if(vacia()){
            System.out.println("Lista vacia");
        }else{
            NodoDoble aux = this.primero;
            for(int i = 0; i < tamano; i++){
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public void imprimirInverso() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = ultimo;

            for(int i=0;i<this.tamano;i++){
                System.out.println(aux.valor);
                aux = aux.anterior;
            }
        }
    }


}
