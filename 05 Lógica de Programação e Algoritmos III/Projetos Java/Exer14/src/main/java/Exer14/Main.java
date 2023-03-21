/*
14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual
é o maior;
 */
package Exer14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int a, b;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro:");
        a = leitor.nextInt();
        System.out.println("Informe um segundo número inteiro:");
        b = leitor.nextInt();
        
        if(a > b){
            System.out.println("O primeiro número é maior!");
        }else{
            if(a < b){
                System.out.println("O segundo número é maior!");
            }else{
                System.out.println("Os dois número são iguais!");
            }
        }
               
   
    }
    
}
