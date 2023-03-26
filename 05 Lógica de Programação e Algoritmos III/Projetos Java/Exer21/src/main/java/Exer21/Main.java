/*
21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade
e saúde) e informe se está apta ou não para cumprir o serviço militar
obrigatório. Informe os totais;
 */
package Exer21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String nome;
        char sexo = 'H', saude = 'S';
        int idade = 0, apto = 0, nApto = 0, contador = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe quantas pessoas deseja verificar:");
        contador = leitor.nextInt();
        
        for(int i = 0; i < contador; i++){
            
            System.out.println("Informe o nome do candidato:");
            nome = leitor.next();
            System.out.println("Informe o sexo do candidato:"
                    + " H - Homem | M - Mulher");
            sexo = leitor.next().charAt(0);
            System.out.println("Informe a idade do candidato:");
            idade = leitor.nextInt();
            System.out.println("Informe o estado de saúde do candidato:"
                    + " S - Saudavel | O - Outros");
            saude = leitor.next().charAt(0);
            
            if(idade >= 18){
                if(sexo == 'H' || sexo == 'h'){
                    if(saude == 'S' || saude == 's'){
                        System.out.println("O candidato está apto!");
                        apto = apto + 1;                
                    }    
                }
            }else{
                System.out.println("O candidato não está apto!");
                nApto = nApto + 1;
            }
            
        }
        
        System.out.println("O total de candidatos aptos ao serviço obrigatório"
                + " é de: " + apto + " candidatos.");
        System.out.println("O total de candidatos  não aptos ao serviço "
                + "obrigatório é de: " + nApto + " candidatos.");
        
    }
    
}
