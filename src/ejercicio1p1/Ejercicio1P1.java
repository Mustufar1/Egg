/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1p1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una variablñe scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crean dos variables tipo entero que lee los datos del usuario
        int num1;
        int num2;
        //muestra un mensaje por pantalla
        System.out.println("Ingresá el primer número: ");
        //Leemos el primer valor
        num1 = Integer.parseInt(leer.next());
        System.out.println("Ingresá el segundo número: ");
        //Leemos el segundo valor
        num2 = Integer.parseInt(leer.next());
        //Y mostramos la suma de los valores
        System.out.println("La suma de los números es " + String.valueOf(num1+num2));
    }
    
}
