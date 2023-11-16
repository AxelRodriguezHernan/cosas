package hashCodeEqual;

public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }


    /* hashCode() siempre asocia a cada objeto con un lugar distinto de memoria para cada ejecucion y devuelve un valor distinto, lo cual dificulta asociar un valor fijo a
    un determinado objeto. Por eso se puede sobreescribir el hashCode() para asignarle un valor fijo.
     */


    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (email !=  null ? email.hashCode() : 0);
        return result;
    }
}
