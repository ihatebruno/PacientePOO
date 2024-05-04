import java.util.Scanner;
public class MainPaciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa nombre y apellido:");
            String nombre = sc.nextLine();
            String apellido = sc.nextLine();
            System.out.println("Ingresa edad:");
            int edad = sc.nextInt();
            
            System.out.println("Ingresa tu altura:");
            double altura = sc.nextDouble();
            Paciente ps= new Paciente();
            ps.setNombre(nombre);
            ps.setApellido(apellido);
            ps.setEdad(edad);
            ps.setAltura(altura);

            ps.getNombre();
            ps.getApellido();
            ps.getEdad();
            ps.getEdad();
            System.out.println(ps.toString());

            sc.close();

    }
}