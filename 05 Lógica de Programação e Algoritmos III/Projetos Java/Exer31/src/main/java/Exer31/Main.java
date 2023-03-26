/*
31. Dados três valores A, B e C, em que A e B são números reais e C é um
caractere, pede-se para imprimir o resultado da operação de A por B se C for
um símbolo de operador aritmético; caso contrário deve ser impressa uma
mensagem de operador não definido. Tratar erro de divisão por zero;
 */
package Exer31;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int a = 0, b = 0;
        double resto = 0;
        char c = 'c';
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        a = leitor.nextInt();
        System.out.println("Informe outro número: ");
        b = leitor.nextInt();
        System.out.println("Informe o tipo de operação que deseja: "
                + "+ Adição | - Subtração | * Multiplicação | / Divisão");
        c = leitor.next().charAt(0);
        
        switch(c){
            case '+':
                System.out.println("O resultado da soma é: " + (a+b));
                break;
            case '-':
                System.out.println("O resultado da subtração é: " + (a-b));
                break;
            case '*':
                System.out.println("O resultado da multiplicação é: " + (a*b));
                break;
            case '/':
                System.out.println("O resultado da divisão é: " + (a/b));
                System.out.println("O resto da divisão é: " + (a%b));
                break;
            default:
                System.out.println("Informe um operador aritimético válido!");
                break;
        }
     
    }
    
}
