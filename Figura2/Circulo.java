package Figura2;

public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return 3.14 * radio * radio;
    }

    public void rotar(){
        System.out.println("circulo rotado");
    }

    public void dibujar(){
        System.out.print("circulo dibujado");
    }
}
