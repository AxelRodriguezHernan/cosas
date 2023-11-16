package ArrayList;

public class Persona {

    //atributos
    int edad;
    String dni;
    String nombre;


    public static final String NOMBRE_POR_DEFECTO = "sIN NOMBRE"; //constante


    //constructores
    public Persona(String datoDni){     //el parametro no puede tener el mismo nombre que el atributo
        dni = datoDni;
        //dni = dni;
    }

    public Persona(String datoDni, int unaEdad){
        dni = datoDni;
        edad = unaEdad;
        nombre = NOMBRE_POR_DEFECTO;
    }

    public Persona(String datoDni, int unaEdad, String unNombre){
        dni = datoDni;
        edad = unaEdad;
        nombre = unNombre;
    }

    //metodos
    public String comer(){
        return nombre +" comiendo";
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", dni='" + dni + '\'' + ", nombre='" + nombre + '\'' + '}';
    }
}

