/*
 20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos
com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o
valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado
de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema
deverá perguntar se deseja continuar calculando desconto até que a resposta
seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral;
 */
package Exer20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        int anoCarro, carroVelho = 0, carroNovo = 0;
        float valorCarro = 0.0f, valorDesconto = 0.0f;
        char continuar = 'S';
        
        Scanner leitor = new Scanner(System.in);
        
        while(continuar == 'S' || continuar == 's'){
            
            System.out.println("Informe o valor do carro: R$");
            valorCarro = leitor.nextFloat();
            System.out.println("Informe o ano do carro:");
            anoCarro = leitor.nextInt();
            
            if(anoCarro <= 2000){
                valorDesconto = valorCarro * 0.12f;
                System.out.println("O valor do desconto é de R$ " + valorDesconto
                    + " o valor a ser pago do carro é de R$ " + (valorCarro - valorDesconto));
                carroVelho = carroVelho + 1;                
            }else{
                valorDesconto = valorCarro * 0.07f;
                System.out.println("O valor do desconto é de R$ " + valorDesconto
                    + " o valor a ser pago do carro é de R$ " + (valorCarro - valorDesconto));
                carroNovo = carroNovo + 1;
            }
                        
            System.out.println("Deseja continuar: S - Sim | N - Não");
            continuar = leitor.next().charAt(0);
        }
        
        System.out.println("A quantidade de carros até o ano 2000 é de " + carroVelho);
        System.out.println("A quantidade de carros depois do ano 2000 é de " + carroNovo);
        
    }
    
}
