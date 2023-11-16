package Figura2;

public class Cuadrado implements Figura, Dibujable{

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }

    public void dibujar(){
        System.out.print("cuadrado dibujado");
    }

}
