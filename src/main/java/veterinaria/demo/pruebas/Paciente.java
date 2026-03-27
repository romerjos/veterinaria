package veterinaria.demo.pruebas;

public class Paciente {
    private String nombre;
    private String especie;
    private int edad;

    public Paciente(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
}