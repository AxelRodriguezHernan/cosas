package Figura;

public class Cuadrado extends Figura{

    private double lado;


    public Cuadrado(){}

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

     protected double calcularArea() {
        return lado * lado;
    }
}
