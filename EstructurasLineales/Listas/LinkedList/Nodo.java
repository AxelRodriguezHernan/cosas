package EstructurasLineales.Listas.LinkedList;

public class Nodo {
    public Nodo siguiente;          //usamos public para poder acceder directamente al atributo siguiente en la clase lista, si fuera private tendriamos que usar getters
    public String valor;


    public Nodo(String valor){
        this.valor = valor;
        siguiente = null;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
