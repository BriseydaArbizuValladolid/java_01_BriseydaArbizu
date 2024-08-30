package Guia7.actividad3;

public class Persona_01 {

    String nombre;
    int edad;
    double peso;

    public String ObtenerNombre() {
        nombre = "Briseyda";
        return nombre;
    }

    public int ObtenerEdad() {
        return 18;
    }

    public double ObtenerPeso() {
        peso = 51.5;
        return peso;
    }

    public boolean esMayorEdad() {
        edad = 18;
        return edad >= 18;
    }

}
