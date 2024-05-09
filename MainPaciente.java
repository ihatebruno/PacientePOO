import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.
        
        // Solicitar al usuario que ingrese el nombre, apellido, edad y altura.
        System.out.println("Ingresa nombre y apellido:");
        String nombre = sc.nextLine();
        String apellido = sc.nextLine();
        System.out.println("Ingresa edad:");
        int edad = sc.nextInt();
        System.out.println("Ingresa tu altura:");
        double altura = sc.nextDouble();
        
        // Crear un objeto Paciente y establecer sus atributos con los valores ingresados por el usuario.
        Paciente ps= new Paciente();
        ps.setNombre(nombre);
        ps.setApellido(apellido);
        ps.setEdad(edad);
        ps.setAltura(altura);

        // Llamar a los métodos getter, pero no se hace nada con los valores de retorno.
        ps.getNombre();
        ps.getApellido();
        ps.getEdad();
        ps.getEdad();
        
        // Imprimir la representación en cadena del objeto Paciente.
        System.out.println(ps.toString());

        sc.close(); // Cerrar el Scanner para evitar fugas de memoria.
    }
}
