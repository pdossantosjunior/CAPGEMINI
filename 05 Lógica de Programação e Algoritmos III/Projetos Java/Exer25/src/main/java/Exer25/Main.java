/*
25. Faça um algoritmo que leia dois números e identifique se são iguais ou
diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são
iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem
que são diferentes;
 */
package Exer25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero1=0, numero2=0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número:");
        numero1 = leitor.nextInt();
        System.out.println("Informe o segundo número:");
        numero2 = leitor.nextInt();
        
        if(numero1 != numero2){
            System.out.println("Os dois número são diferentes!");
            if(numero1 > numero2){
                System.out.println("O primeiro número é maior que o segundo.");
            }else{
                System.out.println("O segundo número é maior que o primeiro.");
            }
        }else{
            System.out.println("Os dois número são iguais!");
        }
        
        
    }
    
}
