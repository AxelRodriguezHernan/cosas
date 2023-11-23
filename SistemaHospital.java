import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SistemaHospital {
    private List<Doctor> doctores = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();

    Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
        SistemaHospital sistema = new SistemaHospital();
        sistema.cargarDoctores();

    }


    class Persona {
        protected String nombre;
        protected String DNI;
        protected String fecha_nacimiento;


        public Persona() {
        }

        protected Persona(String nombre, String DNI, String fecha_nacimiento) {
            this.nombre = nombre;
            this.DNI = DNI;
            this.fecha_nacimiento = fecha_nacimiento;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDNI() {
            return DNI;
        }

        public String getFecha_nacimiento() {
            return fecha_nacimiento;
        }

        public void setDNI(String DNI) {this.DNI = DNI;}

        public void setNombre(String nombre) {this.nombre = nombre;}

        public void setFecha_nacimiento(String fecha_nacimiento) {this.fecha_nacimiento = fecha_nacimiento;}
    }

    class Doctor extends Persona {
        private String especialidad;

        public Doctor(String nombre, String DNI, String fecha_nacimiento, String especialidad) {
            super(nombre, DNI, fecha_nacimiento);
            this.especialidad = especialidad;
        }

        public String getNombre() {
            return super.getNombre();
        }

        public String getDNI() {return super.getDNI();}

        public String getFecha_nacimiento() {
            return super.getFecha_nacimiento();
        }

        public String getEspecialidad() {
            return especialidad;
        }
    }
    //carga los pacientes escritos en el codigo a la lista de tipo pacientes del SistemaHospital
    private void cargarDoctores() {
        Doctor doctor1 = new Doctor("Dr. Juan", "12345678", "01/01/1970", "Cardiología");
        Doctor doctor2 = new Doctor("Dra. María", "87654321", "02/02/1980", "Pediatría");

        doctores.add(doctor1);
        doctores.add(doctor2);
    }
    //carga los pacientes escritos en el codigo a la lista de tipo pacientes del SistemaHospital
    private void cargarPacientes(){

        Paciente paciente1 = new Paciente("Paciente 1", "31159753", "01/01/1990", 123456789, 1);
        pacientes.add(paciente1);
    }

    private void listarDoctores() {
        for (Doctor doc : doctores) {
            System.out.println("Nombre: " + doc.getNombre());
            System.out.println("DNI: + " + doc.getDNI());
            System.out.println("Fecha de Nacimiento: " + doc.getFecha_nacimiento());
            System.out.println("Especialidad" + doc.getEspecialidad());
            System.out.println();
        }
    }


    class Paciente extends Persona implements Informacion, Serializable {
        private int numeroTelefono;
        private int tipoSangre;
        List<String> HistorialMedico;

        public Paciente(String nombre, String DNI, String fecha_nacimiento, int numeroTelefono, int tipoSangre) {
            super(nombre, DNI, fecha_nacimiento);
            this.numeroTelefono = numeroTelefono;
            this.tipoSangre = tipoSangre;
            HistorialMedico.add("Inicio de Seguimiento");
        }

        public int getNumeroTelefono() {
            return numeroTelefono;
        }

        public int getTipoSangre() {
            return tipoSangre;
        }

        public List<String> getHistorialMedico() {
            return HistorialMedico;
        }

        @Override //imprime los eventos de la lista historial de eventos de la clase paciente. Metodo implementado de la inetrfaz Informacion
        public void verHistorialDeEventos() {
            for (String evento : HistorialMedico) {
                System.out.println(evento);
            }
        }

        public void setNumeroTelefono(int numeroTelefono) {this.numeroTelefono = numeroTelefono;}

        public void setTipoSangre(int tipoSangre) {this.tipoSangre = tipoSangre;}

        public void setHistorialMedico(List<String> historialMedico) {HistorialMedico = historialMedico;}

        @Override
        public void setDNI(String DNI) {
            super.setDNI(DNI);
        }

        @Override
        public void setNombre(String nombre) {
            super.setNombre(nombre);
        }

        @Override
        public void setFecha_nacimiento(String fecha_nacimiento) {
            super.setFecha_nacimiento(fecha_nacimiento);
        }
    }

    interface Informacion {
        public void verHistorialDeEventos();
    }
    //registra nuevo paciente agregando un obejto tipo paciente a la lista de pacientes de SistemaHospital


    //añade un nuevo objeto paciente a la lista de pacientes del SistemaHospital.
    private void registrarNuevoPaciente(String nombre, String DNI, String fecha_nacimiento, int numeroTelefono, int tipoSangre){
        Paciente paciente = new Paciente(nombre, DNI, fecha_nacimiento, numeroTelefono, tipoSangre);
        pacientes.add(paciente);
    }

    private void actualizarInformacionPaciente(String dniBuscado){
        for(Paciente paciente : pacientes){
            if(dniBuscado == paciente.getDNI()){
                System.out.println("-Paciente encontrado-");
                System.out.println("Nuevo nombre: ");
                paciente.setNombre(scan.next());
                scan.nextLine();
                System.out.println("Nuevo DNI: ");
                paciente.setDNI(scan.next());
                scan.nextLine();
                System.out.println("Nuevo Fecha de Nacimiento: ");
                paciente.setFecha_nacimiento(scan.next());
                scan.nextLine();
                System.out.println("Nuevo tipo de Sangre: ");
                paciente.setTipoSangre(scan.nextInt());
                scan.nextLine();
                System.out.println("Nuevo nombre: ");
                paciente.setNumeroTelefono(scan.nextInt());
                scan.nextLine();
                System.out.println("El historial medico se modifica utilizando el comando particular especifico para dicha funciona");
                return;
            }else{
                System.out.println("Paciente con DNI identico no encontrado");
                return;
            }
        }
    }

    private void cargarPacienteDesdeArchivo(){
        try{
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("pacientes.txt"));
            pacientes = (List<Paciente>) flujoEntrada.readObject();
            flujoEntrada.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    private void cargarDoctoresDesdeArchivo(){
        try{
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("doctores.txt"));
            doctores = (List<Doctor>)flujoEntrada.readObject();
            flujoEntrada.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void guardarPacientesEnArchivo(){
        try{
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("pacientes.txt"));
            flujoSalida.writeObject(pacientes);
            flujoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void menu() {
        int opcion = 0;

        System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 * 0362 444-2399\nMenu:\n1. Listar Doctores.\n2. Registrar un nuevo paciente.\n3. Actualizar informacion personal de un paciente.\n4. Consultar el historial medico de un paciente\n5. Nuevo historial para un paciente.\n6. Guardar Historial de pacientes en archivo.\n7. Cargar Historial de pacientes desde archivo.\n8. Salir");
        switch (opcion) {
            case 1:
                listarDoctores();
                break;
            default:


        }
    }



}




