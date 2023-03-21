/*
16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno
durante o semestre. Calcular a sua média (aritmética), informar o nome e sua
menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre
5.1 a 6.9);
 */
package Exer16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float nota1, nota2, nota3, mediaAritmetica;
        String nome;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno:");
        nome = leitor.next();
        System.out.println("Informe a primeira nota:");
        nota1 = leitor.nextFloat();
        System.out.println("Informe a segunda nota:");
        nota2 = leitor.nextFloat();
        System.out.println("Informe a terceira nota:");
        nota3 = leitor.nextFloat();
        
        mediaAritmetica = (nota1 + nota2 + nota3) / 3;
        
        if(mediaAritmetica >= 7){
            System.out.println("O aluno " + nome + " foi aprovado com nota "
                    + mediaAritmetica);
        }else{
            if(mediaAritmetica <= 5){
                System.out.println("O aluno " + nome + " foi reprovado com nota "
                    + mediaAritmetica);
            }else{
                System.out.println("O aluno " + nome + " está de recuperação "
                        + "sua média é " + mediaAritmetica);
            }
        }

    }
    
}
