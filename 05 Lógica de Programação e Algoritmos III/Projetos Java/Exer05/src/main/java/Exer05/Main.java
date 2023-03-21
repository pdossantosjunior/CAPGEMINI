/*
 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas
que ele obteve no semestre. No finalinformar o nome do aluno e a sua média (aritmética);
 */
package Exer05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String nome;
        float prova1, prova2, prova3;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        nome = leitor.next();
        System.out.println("Informe a nota da primeira prova: ");
        prova1 = leitor.nextFloat();
        System.out.println("Informe a nota da segunda prova: ");
        prova2 = leitor.nextFloat();
        System.out.println("Informe a nota da terceira prova: ");
        prova3 = leitor.nextFloat();
        
        System.out.println("O aluno " + nome + ". Sua média é "
            + (prova1 + prova2 + prova3)/3);
      
    }
    
}
