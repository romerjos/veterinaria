package veterinaria.demo.pruebas;

public class Paciente {
    private String nombre;
    private String especie;
    private int edad;
    private String propietario;

    public Paciente(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.propietario = propietario;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Propietario: " + propietario);
    }
}