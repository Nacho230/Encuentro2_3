/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro2_3_Ej01;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La suma de los dos numeros es " + (num1+num2));
    }
    
}
