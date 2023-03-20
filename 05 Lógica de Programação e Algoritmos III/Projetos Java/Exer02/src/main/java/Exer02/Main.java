/*
2. Faça um algoritmo que receba dois números e ao final mostre a soma,
subtração, multiplicação e a divisão dos dois números lidos;
 */
package Exer02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float a, b;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        a = leitor.nextFloat();
        System.out.println("Informe o segundo número: ");
        b = leitor.nextFloat();
        System.out.println("A soma dos dois números é: " + (a + b));
        System.out.println("A subtração dos dois números é: " + (a - b));
        System.out.println("A multiplicação dos dois números é: " + (a * b));
        System.out.println("A divisão dos dois números é: " + (a / b));
        
    }
    
}