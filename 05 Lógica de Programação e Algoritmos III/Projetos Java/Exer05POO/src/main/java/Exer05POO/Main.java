/*
Escreva uma classe cujos objetos representam alunos matriculados em uma
disciplina. Cada objeto dessa classe deve guardar os seguintes dados do 
aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho
tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se 
ele não for para a final)
 */
package Exer05POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Aluno a = new Aluno();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a nota da primeira prova:");
        a.setProva1(leitor.nextFloat());
        System.out.println("Informe a nota da segunda prova:");
        a.setProva2(leitor.nextFloat());
        System.out.println("Informe a nota do trabalho:");
        a.setTrabalho(leitor.nextFloat());
        System.out.println("A média é: " + a.media());
        
        /*Faltou informações para melhorar a compreensão do exercício, tal como
        qual é a nota máxima e o se for 10 os pesos não batem, e neste caso a 
        última prova tem peso 3?*/
                
    }
    
}
