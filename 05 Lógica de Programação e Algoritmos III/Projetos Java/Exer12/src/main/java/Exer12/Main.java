/*
12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o 
percentual do distribuidor e dos impostos aplicados (primeiro os impostos são
aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre
o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o 
custo ao consumidor do mesmo;
 */
package Exer12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float preco;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o preço de custo do carro: R$");
        preco = leitor.nextFloat();
                
        System.out.println("O valor final do carro para venda é de R$" 
                    + ((preco * 1.45) * 1.28));
   
    }
    
}
