
package Guia7.actividad3;

public class principal {

    public static void main(String[] args) {
        Persona_01 persona = new Persona_01();
                int edad = persona.ObtenerEdad();
                System.out.println("La edad es: " + edad);
                String nombre = persona.ObtenerNombre();
                System.out.println("El nombre es: " + nombre);
                double peso = persona.ObtenerPeso();
                System.out.println("El peso: " + peso);
                boolean mayorEdad = persona.esMayorEdad();
                System.out.println("Es mayor de edad " + mayorEdad);
    }
    
}
