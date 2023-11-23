package EstructurasLineales.Listas.LinkedList;
//clase lista simplemente enlazada
public class ListaSimple {
    private Nodo primero;
    private int tamano;

    public ListaSimple(){
        this.primero = null;
        this.tamano = 0;
    }

    public boolean vacia(){
        return this.primero == null;
    }

    public void agregarFinal(String valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = this.primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamano++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
            } else {
                // Le indico al nodo anterior que no apunte más al nodo a eliminar "aux".
                nodoAnterior.siguiente = null;
            }

            // Decremento el tamaño
            this.tamano--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i<this.tamano; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public void agregarComienzo(String valor){
        Nodo nuevoNodo = new Nodo(valor);

        if(vacia()){
            this.primero = nuevoNodo;
        }else{
            nuevoNodo.siguiente = this.primero;
            this.primero = nuevoNodo;
        }
     tamano++;
    }

    public void obtenerValor(int indice){
        if(indice > this.tamano){
            System.out.println("Indice invalido");
    }else{
            Nodo aux = this.primero;
            for(int i = 0; i < indice-1; i++){
                aux = aux.siguiente;
            }
            System.out.println(aux.valor);
        }
    }
}