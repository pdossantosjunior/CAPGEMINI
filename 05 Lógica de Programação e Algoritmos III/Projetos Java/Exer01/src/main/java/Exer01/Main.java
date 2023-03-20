/*
1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 */
package Exer01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int a, b;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        a = leitor.nextInt();
        System.out.println("Informe o segundo número: ");
        b = leitor.nextInt();
        System.out.println("A soma dos dois números é: " + (a + b));
        
    }
    
}
