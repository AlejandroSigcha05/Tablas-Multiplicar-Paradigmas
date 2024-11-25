/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p.declarativo;

import java.util.Scanner;

/**
 *
 * @author jhair
 */
public class PDeclarativo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.print("Escriba un numero: ");
        num = entrada.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
    }
}
