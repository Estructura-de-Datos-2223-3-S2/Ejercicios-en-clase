/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primos;

import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese un número");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int aux = number -1;
        boolean isPrime = true;
        
        while (aux > 1) {
            if (number%aux == 0) {
                isPrime = false;
                break;
            }
            aux--;
        }
        if (isPrime){
            System.out.println("Es primo ");
        } else {
            System.out.println("No es primo");
        }
    }
    
}
