/*
29. Faça um algoritmo que receba o número do mês e mostre o mês
correspondente. Valide mês inválido;
 */
package Exer29;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int mes = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um mês do ano: ");
        mes = leitor.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("O mês informado foi Janeiro.");
                break;
            case 2:
                System.out.println("O mês informado foi Fevereiro.");
                break;
            case 3:
                System.out.println("O mês informado foi Março.");
                break;
            case 4:
                System.out.println("O mês informado foi Abril.");
                break;
            case 5:
                System.out.println("O mês informado foi Maio.");
                break;
            case 6: 
                System.out.println("O mês informado foi Junho.");
                break;
            case 7:   
                System.out.println("O mês informado foi Julho.");
                break;
            case 8:   
                System.out.println("O mês informado foi Agosto.");
                break;
            case 9:   
                System.out.println("O mês informado foi Setembro.");
                break;
            case 10:
                System.out.println("O mês informado foi Outubro.");
                break;
            case 11:
                System.out.println("O mês informado foi Novembro.");
                break;
            case 12:
                System.out.println("O mês informado foi Dezembro.");
                break;
            default:
                System.out.println("O valor informado é inválido!");
                break;
        }    
    }
    
}
