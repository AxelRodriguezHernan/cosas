package EstructurasLineales.Listas.LinkedList;

public class main {
    public static void main(String[] args){
        ListaSimple lista1 = new ListaSimple();

        lista1.imprimir();
        lista1.agregar("hola");
        lista1.agregar("como");
        lista1.agregar("estas");
        lista1.imprimir();
        lista1.eliminarUltimo();
        lista1.imprimir();

        System.out.println("-----------------------------");

        ListaDoble lista2 = new ListaDoble();
        lista2.imprimir();
        lista2.imprimirInverso();
        lista2.agregar("hola");
        lista2.agregar("como");
        lista2.agregar("estas");
        lista2.imprimir();
        lista2.imprimirInverso();
        lista2.agregarInicio("javier");
        lista2.eliminarUltimo();
        lista2.imprimir();
    }
}
