package EstructurasLineales.Listas.LinkedList;

public class main {
    public static void main(String[] args){
        ListaSimple lista1 = new ListaSimple();

        //lista1.imprimir();
        lista1.agregarFinal("hola");
        lista1.agregarFinal("como");
        lista1.agregarFinal("estas");

        //agrega a felipe al comienzo
        //lista1.imprimir();
        //lista1.agregarComienzo("felipe");
        //lista1.imprimir();

        //devuelve el valor de un elemento de la lista dado su indice
        lista1.obtenerValor(7);

    //    System.out.println("-----------------------------");

    //    ListaDoble lista2 = new ListaDoble();
    //    lista2.imprimir();
    //    lista2.imprimirInverso();
    //    lista2.agregar("hola");
    //    lista2.agregar("como");
    //    lista2.agregar("estas");
    //    lista2.imprimir();
    //    lista2.imprimirInverso();
    //    lista2.agregarInicio("javier");
    //    lista2.eliminarUltimo();
    //    lista2.imprimir();
    }
}
