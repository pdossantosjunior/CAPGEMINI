/*
 10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações
sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor
das prestações;
 */
package Exer10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float calculo;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor da compra: R$");
        calculo = leitor.nextFloat();
        
        calculo = calculo / 5;
        
        System.out.println("O valor das prestações será de R$ " + calculo);        
        
    }
    
}
