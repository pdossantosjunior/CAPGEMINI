/*
28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus
584 funcionários de acordo com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule
o seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e 
seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento;
 */
package Exer28;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String nome;
        float salarioAtual = 0.0f, salarioMinimo = 0.0f;
        float reajuste = 0.0f, salarioNovo = 0.0f;
        float folhaEmpresa = 0.0f;
        int contadorFuncionarios = 0; //Facilitador da vida
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor do salário mínimo: R$");
        salarioMinimo = leitor.nextFloat();
        System.out.println("Informe quantos funcionários serão verificados:");
        contadorFuncionarios = leitor.nextInt();
        
        for(int i = 0; i < contadorFuncionarios; i++){
            
            System.out.println("Informe o nome do funcionário:");
            nome = leitor.next();
            System.out.println("Informe o salário atual do funcionário: R$");
            salarioAtual = leitor.nextFloat();
            
            if(salarioAtual <= (salarioMinimo*3)){
                reajuste = salarioAtual * 0.5f;
                salarioNovo = salarioAtual + reajuste;
            }else if(salarioAtual <= (salarioMinimo*10)){
                reajuste = salarioAtual * 0.2f;
                salarioNovo = salarioAtual + reajuste;    
            }else if(salarioAtual <= (salarioMinimo*20)){
                reajuste = salarioAtual * 0.15f;
                salarioNovo = salarioAtual + reajuste;    
            }else{
                reajuste = salarioAtual * 0.10f;
                salarioNovo = salarioAtual + reajuste;
            }
            
            System.out.println("O funcionário " + nome + " teve um reajuste"
                    + " de R$ " + reajuste + " e seu novo salário é de R$ "
                    + salarioNovo);
            
            folhaEmpresa = folhaEmpresa + reajuste;
     
        }      
        System.out.println("A empresa terá um aumento em folha de R$ "
                    + folhaEmpresa);    
    }
    
}
