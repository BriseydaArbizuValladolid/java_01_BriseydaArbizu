/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import javax.swing.JOptionPane;

public class EjercicioDos {

    int suma, resta, mult;
    int a, b;
    double div;

    public void suma() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        suma = a + b;
    }

    public void resta() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        resta = a - b;
    }

    public void mult() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));

        mult = a * b;
    }

    public void div() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));

        div = a / b;
    }

    public void mostrarDatos() {
        System.out.println("\nSuma: " + suma+ "\nResta: " + resta + "\nMult: " + mult + "\nDiv: " + div);
    }
}

