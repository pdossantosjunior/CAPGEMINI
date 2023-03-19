/*
20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
 */
package ExercicioVinte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        char desejaRepetir = 's';
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        Scanner leitor = new Scanner(System.in);
        int carrosAte2000 = 0;
        int todosCarros = 0;
        
        while(desejaRepetir == 's' || desejaRepetir == 'S'){
            
            System.out.println("Digite o ano de fabricação do carro: ");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor do carro: ");
            valorCarro = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
                carrosAte2000++;
            }else{
                porcentagemDesconto = 0.07f;
            }
            
            todosCarros++;
            
            valorDesconto = valorCarro * porcentagemDesconto;
            
            System.out.println("O valor do desconto é de R$ " + valorDesconto );
            System.out.println("O valor a ser pago é de R$ " + (valorCarro - valorDesconto));
            
            System.out.println("Deseja continuar: Sim - S ou Não - N ");
            desejaRepetir = leitor.next().charAt(0);              
        }
        
        System.out.println("O total de carros fabricados até o ano 2000 é de " + carrosAte2000 + " carros.");
        System.out.println("O total geral de carros é de " + todosCarros + " carros");
  
    }
    
}
