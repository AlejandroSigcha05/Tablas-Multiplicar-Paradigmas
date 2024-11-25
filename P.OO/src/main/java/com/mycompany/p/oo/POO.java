/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p.oo;

import java.util.Scanner;

/**
 *
 * @author jhair
 */
public class POO {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int num = entrada.nextInt();

        // Crear un objeto Tabla para generar la tabla de multiplicar
        Tabla tabla = new Tabla(num);
    }
}

class Tabla {
    private final int numero;

    public Tabla(int numero) {
        this.numero = numero;

        // Imprimir la tabla de multiplicar
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}