/*
18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem
informando “maior de idade” e “menor de idade” para cada pessoa. Considere a 
idade a partir de 18 anos como maior de idade;
 */
package Exer18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int idade, contador = 5;     //Coloquei um contador para facilitar a vida.
               
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 1; i <= contador; i++){
            
            System.out.println("Informe a idade do " + i + "º individuo:");
            idade = leitor.nextInt();
            
            if(idade >= 18){
                System.out.println("É maior de idade!");
            }else{
                System.out.println("É menor de idade!");
            }

        }

    }
    
}
