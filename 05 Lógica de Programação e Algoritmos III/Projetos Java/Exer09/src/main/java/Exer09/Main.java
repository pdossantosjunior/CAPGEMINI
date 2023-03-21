/*
 9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor
com rendimento após um mês. Considere fixo o juro da poupança em 0,07% a. m;
 */
package Exer09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        double deposito, rendimentoMensal;
        int meses = 0;
        char opcao = 'S';
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor do depósito: R$ ");
        deposito = leitor.nextFloat();
        
        System.out.println("Após um mês o seu depósito terá um montande de R$ "
                    + (deposito * 1.0007));
        
        //Fim da parte sugerida pelo exercício.
        
        System.out.println("Deseja calcular o rendimento para mais meses:"
                + " S - SIM / N - NÃO");
        opcao = leitor.next().charAt(0);
        
        if (opcao == 'S' || opcao == 's'){
                        
            System.out.println("Informe a quantidade de meses que deseja "
                + "calcular os rendimentos da poupança: ");
            meses = leitor.nextInt();
                
            rendimentoMensal = deposito;
            
            for(int i = 1; i <= meses; i++){
                
                rendimentoMensal = (rendimentoMensal * 1.0007);
                System.out.println("No " + i + "º mês de rendimento o montante "
                        + "acumalado é de R$ " + rendimentoMensal);                
            }
            System.out.println("Obrigado pela consulta!");
        }else{
            System.out.println("Obrigado pela consulta!");
        }
    
    }
    
}
