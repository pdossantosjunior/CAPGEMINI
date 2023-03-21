/*
19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o
nome e se ela é homem ou mulher. No final informe total de homens e de mulheres;
 */
package Exer19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int totalHomens = 0, totalMulheres = 0, contador = 5;     //Coloquei um contador para facilitar a vida.
        char sexo;
        String nome;
               
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 1; i <= contador; i++){
            
            System.out.println("Informe o nome do " + i + "º individuo:");
            nome = leitor.next();
            System.out.println("Informe o sexo do " + i + "º individuo: "
                    + "H - Homem / M - Mulher");
            sexo = leitor.next().charAt(0);
            
            if(sexo == 'H' || sexo == 'h'){
                totalHomens = totalHomens + 1;
            }else{
                if(sexo == 'M' || sexo == 'm'){
                    totalMulheres = totalMulheres + 1;
                }
                
            }

        }
        
        System.out.println("O total de homens foi: " + totalHomens);
        System.out.println("O total de mulheres foi: " + totalMulheres);

    }
    
}
