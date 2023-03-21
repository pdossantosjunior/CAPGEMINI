/*
 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em
real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor
da cotação do dólar e também a quantidade de dólares disponíveis com o usuário;
 */
package Exer08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float cotacaoDolar, qtdDolar;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a cotação atual do Dolar em Reais: R$");
        cotacaoDolar = leitor.nextFloat();
        System.out.println("Informe a quantidade de dolares que possui: US$ ");
        qtdDolar = leitor.nextFloat();
        
        System.out.println("Você possui R$ " + (qtdDolar * cotacaoDolar)
                    + " em Dolar.");
        
        
    }
    
}
