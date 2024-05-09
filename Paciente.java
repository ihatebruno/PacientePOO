public class Paciente {
    String nombre,apellido; // Variables para almacenar el nombre y el apellido del paciente.
    int edad; // Variable para almacenar la edad del paciente.
    double altura; // Variable para almacenar la altura del paciente.

    // Métodos getter y setter para el nombre.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el apellido.
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos getter y setter para la edad.
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos getter y setter para la altura.
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método toString para representar el objeto Paciente como una cadena de texto.
    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", Altura=" + altura + "]";
    }
}
