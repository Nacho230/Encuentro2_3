/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro2_3_Ej04;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados: ");
        int gradosC = leer.nextInt();
        int gradosF = 32 + (9 * gradosC / 5);
        System.out.println("Los grados Fahrenheit son: " + gradosF);
    }
    
}
