/*
27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com
desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor
a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do
veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou
diesel –14%). Com valor do veículo zero encerra entrada de dados. 
Informe total de desconto e total pago pelos clientes;
 */
package Exer27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        float valor = 1.0f, valorDesconto = 0.0f, valorPagar = 0.0f;
        char combustivel = 'G';
        
        Scanner leitor = new Scanner(System.in);
        
        while(valor !=0){
        
        System.out.println("Informe o valor do veículo:");
        valor = leitor.nextFloat();
        
        if(valor !=0){
        System.out.println("Informe o tipo de combustível do veículo: "
                + "G - Gasolina | A - Álcool | D - Diesel");
        combustivel = leitor.next().charAt(0);
        
            if(combustivel == 'A' || combustivel == 'a'){
                valorDesconto = valor * 0.25f;
                valorPagar = valor - valorDesconto;
                System.out.println("O valor do desconto é de: R$ " + valorDesconto);
                System.out.println("O valor a pagar do veículo é: R$ " + valorPagar);
            }else if(combustivel == 'G' || combustivel == 'g'){
                valorDesconto = valor * 0.21f;
                valorPagar = valor - valorDesconto;
                System.out.println("O valor do desconto é de: R$ " + valorDesconto);
                System.out.println("O valor a pagar do veículo é: R$ " + valorPagar);
            }else if(combustivel == 'D' || combustivel == 'd'){
                valorDesconto = valor * 0.14f;
                valorPagar = valor - valorDesconto;
                System.out.println("O valor do desconto é de: R$ " + valorDesconto);
                System.out.println("O valor a pagar do veículo é: R$ " + valorPagar);
                }else{
                    System.out.println("Informe uma opção de combustivel válida!");
                }
            }else{
        System.out.println("Obrigado pela preferência!");
            }
        }
    }  
}
