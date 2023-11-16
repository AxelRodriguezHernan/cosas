package Figura;
//las clases abstractas son clases cuyos metodos son abstractos y vacios, otras clases le daran usos a sus metodos y atributos.
//tampoco puede instanciarse un objeto de clase abstracta. No permite herencia multiple, Pues una clase oslo puede heredar de otra unica clase.
//las clases abstractas se centran mas en el ES/SER de un objeto

public abstract class Figura {
    protected double x;
    protected double y;

    protected Figura(){}

    protected Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Solo declaramos el metodo pero no lo inicializamos. La inicializacion corre por parte de las clases hijas
    protected abstract double calcularArea();
}
