/*
11. Faça um algoritmo que receba o preço de custo de um produto e mostre o 
valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo
com um percentual informado pelo usuário;
 */
package Exer11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float precoCusto, acrescimo;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o preço de custo do produto: R$");
        precoCusto = leitor.nextFloat();
        System.out.println("Informe o percentual do acréscimo da venda: ");
        acrescimo = leitor.nextFloat();
        
        System.out.println("O valor final do produto para venda é de R$" 
                    + (precoCusto + (precoCusto*acrescimo)/100));
        
        
        
        
        
        
    }
    
}
