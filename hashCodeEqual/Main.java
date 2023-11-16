package hashCodeEqual;
//hashCode() y equal() son metodos por defualt que todas las clases heredan de la clase objeto. Estos pueden ser sobreescritos con cada clase hija
/* el hashCode un codigo asociado al lugar de memoria de cada objeto y por ende, asociado a cada objeto de manera unica. Pero el hashcode cambia con cada ejecucion del programa */

public class Main {
    public static void main(String[] args){

        Usuario usuario1 = new Usuario("susana", "susana@email.com");
        Usuario usuario2 = new Usuario("juan", "juan@email.com");
        System.out.println(usuario1.hashCode());
        System.out.println(usuario2.hashCode());
    }
}
