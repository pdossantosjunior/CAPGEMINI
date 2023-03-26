/*
26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
Caso o usuário digite um número que não esteja neste intervalo, exibir a
seguinte mensagem: número inválido;
 */
package Exer26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        numero = leitor.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("Um foi o número informado.");
                break;
            case 2:
                System.out.println("Dois foi o número informado.");
                break;
            case 3:
                System.out.println("Três foi o número informado.");
                break;
            case 4:
                System.out.println("Quatro foi o número informado.");
                break;
            case 5:
                System.out.println("Cinco foi o número informado.");
                break;
            default:
                System.out.println("O número informado é inválido.");
                break;    
        }
   
    }
    
}
