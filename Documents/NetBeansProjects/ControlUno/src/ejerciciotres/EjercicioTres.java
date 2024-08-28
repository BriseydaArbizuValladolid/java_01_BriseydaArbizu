/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class EjercicioTres {

    int suma, resta, mult;
    double div;
    int a, b;

    public void suma() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar dos números para sumarlos: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        suma = a + b;
        System.out.println(suma);
        JOptionPane.showMessageDialog(null, "Suma: " + suma);
    }

    public void resta() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar dos números para restarlos: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        resta = a - b;
        System.out.println(resta);
        JOptionPane.showMessageDialog(null, "Resta: " + resta);
    }
    public void mult() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar dos números para multiplicarlos: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        mult = a * b;
        System.out.println(mult);
        JOptionPane.showMessageDialog(null, "Mult: " + mult);
    }
    public void div() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar dos números para dividirlos: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        div = a / b;
        System.out.println(div);
        JOptionPane.showMessageDialog(null, "Div: " + div);
    }

    
    
}
