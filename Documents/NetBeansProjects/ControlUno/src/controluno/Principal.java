/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controluno;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        EjercicioUno uno = new EjercicioUno();
        uno.Suma(5, 7);
        uno.Resta(10, 24);
        uno.Mult(2, 3);
        uno.Div(10, 5);
        uno.mostrarDatos();
        
    }

}
