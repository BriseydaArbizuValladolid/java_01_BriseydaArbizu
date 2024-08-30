package Guia7.actividad4;

public class Persona_01 {
int suma;
int mult;
String nombre;
int edad;
    public void Datos(String nombre, int edad) {
        System.out.println("Mi nombre es " + nombre + " tengo " + edad + " años");
    }

    public void Sumando(int a, int b) {
        suma = a + b;
        System.out.println("La suma es " + suma);
    }

    public void multiplicando(int a, int b) {
        mult = a * b;
        System.out.println("La multiplicación es " + mult);
    }
}
