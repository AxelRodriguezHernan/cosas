package Figura2;

//las interfaces no poseen atributos y sus metodos son abstractos. Si permite herencia multiple pues una clase puede implementar multiples interfaces
//las interfaces se centran mas en el QUE HACE un objeto

public interface Figura {

    //no hace falta escribir abstract pues los metodos de las interfaces ya son abstractos por defecto
    public double calcularArea();
}
