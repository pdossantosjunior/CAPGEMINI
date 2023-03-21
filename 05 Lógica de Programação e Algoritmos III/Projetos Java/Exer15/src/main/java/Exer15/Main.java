/*
15. Faça um algoritmo que receba um número e diga se este número está no
intervalo entre 100 e 200;
 */
package Exer15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro:");
        numero = leitor.nextInt();
                
        if(numero >= 100 && numero <= 200){
            System.out.println("O número está entre 100 e 200");
        }else{
            System.out.println("Obrigado!");
        }
               
   
    }
    
}
