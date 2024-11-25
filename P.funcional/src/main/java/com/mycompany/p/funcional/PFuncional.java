/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p.funcional;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author jhair
 */
public class PFuncional {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int num = entrada.nextInt();

        IntStream.rangeClosed(1, 12) // Generar los números del 1 al 12
                 .forEach(i -> System.out.println(num + " x " + i + " = " + (num * i))); // Imprimir directamente

        entrada.close();
    }
}
