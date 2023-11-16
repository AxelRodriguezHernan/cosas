package Figura;

public class Circulo extends Figura{
    double radio;

    public Circulo() {
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }


    @Override
    protected double calcularArea() {
        return 3.14 * radio * radio;
    }
}
