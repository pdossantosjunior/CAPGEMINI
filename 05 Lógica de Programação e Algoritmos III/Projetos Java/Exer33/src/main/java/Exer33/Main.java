/*
33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
Faça um algoritmo que calcule e exiba o salário de um professor. Sabe-se que
o valor da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
 */
package Exer33;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float salario = 0.0f;
        int qtdHoras = 0;
        char nivelProf = '0';
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nível do professor: "
                + "Nível 1 - 1 | Nível 2 - 2 | Nível 3 - 3");
        nivelProf = leitor.next().charAt(0);
        System.out.println("Informe a quantidade de horas trabalhas:");
        qtdHoras = leitor.nextInt();
        
        switch(nivelProf){
            case '1':
                salario = qtdHoras*12.00f;
                System.out.println("O salário do professor é de R$ " + salario);
                break;
            case '2':
                salario = qtdHoras*17.00f;
                System.out.println("O salário do professor é de R$ " + salario);
                break;
            case '3':
                salario = qtdHoras*25.00f;
                System.out.println("O salário do professor é de R$ " + salario);
                break;
            default:
                System.out.println("Informação inválida!");
                break;
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
