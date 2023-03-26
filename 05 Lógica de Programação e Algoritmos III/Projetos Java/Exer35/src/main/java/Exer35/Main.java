/*
35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.
 */
package Exer35;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int qtdConsumida=0;
        float totalPgar=0.0f;
        char tipoCliente = 'O';
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de KW/H consumida:");
        qtdConsumida = leitor.nextInt();
        System.out.println("Informe o tipo da unidade consumidora:");
        System.out.println("R - Residencia | C - Comercial | I - Industrial");
        tipoCliente = leitor.next().charAt(0);
        
        if(tipoCliente=='r' || tipoCliente=='R'){
            totalPgar = qtdConsumida*0.60f;
            System.out.println("O valor da conta de Luz é: R$ " + totalPgar);
        }else if(tipoCliente=='c' || tipoCliente=='C'){
            totalPgar = qtdConsumida*0.48f;
            System.out.println("O valor da conta de Luz é: R$ " + totalPgar);
        }else if(tipoCliente=='i' || tipoCliente=='I'){
            totalPgar = qtdConsumida*1.29f;
            System.out.println("O valor da conta de Luz é: R$ " + totalPgar);
        }else{
            System.out.println("Dados inválidos!");
        } 
        
        
    }
    
}
