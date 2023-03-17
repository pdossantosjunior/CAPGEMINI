/*
 24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
 */
package ExercicioEstruturaRepeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       Scanner leitorScanner = new Scanner(System.in);
       char desejaContinuar = 'S';
       
       while(desejaContinuar == 'S' || desejaContinuar == 's'){
           
           System.out.println("Digite um número: ");
           int numero = leitorScanner.nextInt();
           
           if(numero == 0){
               System.out.println("O número é 0!");
           }else{
               if(numero > 0){
                   System.out.println("O número é maior que 0!");
               }else{
                   System.out.println("O número é menor que 0!");
               }
           }
           
           System.out.println("Deseja continuar? S - SIM / N - NÃO");
           desejaContinuar = leitorScanner.next().charAt(0);
           
       }
       
        
        
        
    }
    
}
