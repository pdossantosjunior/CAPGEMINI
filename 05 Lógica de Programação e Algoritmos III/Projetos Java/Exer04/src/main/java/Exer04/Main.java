/*
4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome,
o salário fixo e salário no final do mês;
 */
package Exer04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String nome;
        float salario, totalVendas;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome do vendedor: ");
        nome = leitor.next();
        System.out.println("Informe o salário fixo do vendedor: ");
        salario = leitor.nextFloat();
        System.out.println("Informe o total de vendas do vendedor: ");
        totalVendas = leitor.nextFloat();
        System.out.println("Vendedor(a) " + nome + ", seu salário fixo é de R$ "
                + salario + " e seu salário final (com comissão) é de R$ " + 
                (salario + (totalVendas * 0.15)));
        
    }
    
}