/*
30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva
em ordem crescente;
 */
package Exer30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero1 = 0, numero2 = 0, numero3 = 0;
        Scanner leitor = new Scanner(System.in);
        
       System.out.println("Informe três número inteiro distintos:");
       System.out.println("Informe o primeiro número:");
       numero1 = leitor.nextInt();
       System.out.println("Informe o segundo número:");
       numero2 = leitor.nextInt();
       System.out.println("Informe o terceiro número:");
       numero3 = leitor.nextInt();
       
       if(numero1 > numero2 && numero1 > numero3){
           if(numero2 > numero3){
               System.out.println("Os números em ordem crescente ficam: "
                    + numero3 + " " + numero2 + " " + numero1);
           }else{
               System.out.println("Os números em ordem crescente ficam: "
                    + numero2 + " " + numero3 + " " + numero1);   
           }  
       }else if(numero2 > numero1 && numero2 > numero3){
           if(numero1 > numero3){
               System.out.println("Os números em ordem crescente ficam: "
                    + numero3 + " " + numero1 + " " + numero2);
           }else{
               System.out.println("Os números em ordem crescente ficam: "
                    + numero1 + " " + numero3 + " " + numero2);   
           }
       }else if(numero3 > numero1 && numero3 > numero2){
           if(numero1 > numero2){
               System.out.println("Os números em ordem crescente ficam: "
                    + numero2 + " " + numero1 + " " + numero3);
           }else{
               System.out.println("Os números em ordem crescente ficam: "
                    + numero1 + " " + numero2 + " " + numero3);   
           }
       }   
    }
    
}
