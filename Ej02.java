/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro2_3_Ej02;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingresa tu nombre:");
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresado es:" + "[" + nombre + "]");
    }
    
}
