/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro2_3_Ej05;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        System.out.println("El doble es " + numero * 2);
        System.out.println("El triple es " + numero * 3);
        System.out.println("La raiz cuadrada es " + Math.sqrt(numero));
    }
    
}
