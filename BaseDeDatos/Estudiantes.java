package BaseDeDatos;
import java.sql.*;

public class Estudiantes {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/universidad"; //URL de conexion a la base de datos
        String usuario = "root"; //nombre del usuario de la base de datos
        String password = "password"; //contraseña del usuario de la base de datos


        try{
            //se establece conexion a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, password);

            //se crea una declarion SQL para enviar consultas a la base de datos
            Statement statement = conexion.createStatement();

            //ejecutar una consulta para obtener todos los datos de estudiantes. es opcional pero ayuda a la claridad del codigo
            String consulta = "SELECT * FROM estudiantes";
            ResultSet resultado  = statement.executeQuery(consulta);

            //iterar a traves de los resultados y mostrarlos  por consola
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String legajo = resultado.getString("legajo");
                String dni = resultado.getString("dni");

                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("Legajo: " + legajo);
                System.out.println("DNI: " + dni);
                System.out.println("---------------------------");
            }

            //se cierran los recursos
            resultado.close();
            statement.close();
            conexion.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
