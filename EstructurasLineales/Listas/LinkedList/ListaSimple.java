package EstructurasLineales.Listas.LinkedList;

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

    public void agregar(String valor){
        Nodo nuevo = new Nodo(valor);
        if(vacia()){
            //agregamos el nuevo nodo como el primero
           this.primero = nuevo;
        }else{
            //se recorre la lista hasta llegar al ultimo nodo
        Nodo aux = this.primero;

        while(aux.siguiente != null){
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
        }
        this.tamano++;
    }


    public void eliminarUltimo(){
        if(vacia()){
            System.out.println("Lista vacia");
        }else{
            //se tiene que recorrer la lista hasta llegar al ultimo nodo;
            Nodo aux = this.primero;
            Nodo nodoAnterior = aux;

            while(aux.siguiente != null){
                nodoAnterior = aux;
                aux = aux.siguiente;
            }
            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.

            if(aux == this.primero){
                this.primero = null;
            }else{
                // Le indico al nodo anterior que no apunte más al nodo a eliminar "aux".
                nodoAnterior.siguiente = null;
            }
        }
        this.tamano--;
    }

    public void imprimir(){
        if(vacia()){
            System.out.println("Lista vacia");
        }else{
            Nodo aux = this.primero;
            for(int i = 0; i < this.tamano; i++){
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}
