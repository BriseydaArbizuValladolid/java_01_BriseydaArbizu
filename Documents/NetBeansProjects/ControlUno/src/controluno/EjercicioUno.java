/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controluno;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class EjercicioUno {

    int suma, resta, mult;
    double div;

    public void Suma(int a, int b) {
        suma = a + b;
    }

    public void Resta(int a, int b) {
        resta = a - b;
    }

    public void Mult(int a, int b) {
        mult = a * b;
    }

    public void Div(int a, int b) {
        div = a / b;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "\nSuma: " + suma + "\nResta: " + resta + "\nMult: " + mult + "\nDiv: " + div);
    }
   
}
