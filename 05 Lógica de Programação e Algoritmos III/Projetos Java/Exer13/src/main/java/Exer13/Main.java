/*
13. Faça um algoritmo que receba um número e mostre uma mensagem caso este
número seja maior que 10;
 */
package Exer13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        numero = leitor.nextInt();
        
        
        if(numero > 10){
            System.out.println("O número informado é maior que 10.");     
        }else{
            System.out.println("O número informado é menor ou igual que 10.");
        }
  
   
    }
    
}
