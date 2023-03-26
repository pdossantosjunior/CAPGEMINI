/*
24. Faça um algoritmo que receba “N” números e mostre positivo, negativo
ou zero para cada número;
 */
package Exer24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero = 0;
        int contador = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe quantos números deseja testar:");
        contador = leitor.nextInt();
        
        for (int i = 0; i < contador; i++) {
            
            System.out.println("Informe o número deseja testar:");
            numero = leitor.nextInt();
            
            if(numero == 0){
                System.out.println("O número informado é nulo!");
            }else{
                if(numero > 0){
                    System.out.println("O número informado é positivo!");
                }else{
                    System.out.println("O número informado é negativo!");
                }
            }
            
        }
        
        
        
        
        
        
        
        
    }
    
}
