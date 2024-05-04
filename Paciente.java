public class Paciente {
    String nombre,apellido;
    int edad;
    double altura;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", Altura=" + altura + "]";
    }
    
    

}