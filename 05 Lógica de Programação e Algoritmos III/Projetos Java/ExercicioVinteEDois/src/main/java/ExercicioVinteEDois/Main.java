/*
22. Fa�a um algoritmo que receba o pre�o de custo e o preço de venda de 40
produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada
produto. Informe o valor de custo de cada produto, o valor de venda de cada 
produto, a média de pre�o de custo e do preço de venda;
*/
package ExercicioVinteEDois;

    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
       String nomeProduto;
       float precoCusto, precoVenda, totalCusto = 0.0f;
       float mediaCusto = 00.f, mediaVenda = 0.0f, totalVenda = 0.0f;
       int contador = 40;   //Criei esse contador para facilitar os testes
       
       Scanner leitor = new Scanner(System.in); //Cria o leitor
       
       for(int i = 0; i < contador; i++){
           
           System.out.println("Digite o nome do produto:");
           nomeProduto = leitor.nextLine();
           
           System.out.println("Digite o preço de custo do produto:");
           precoCusto = leitor.nextFloat();
           
           System.out.println("Digite o preço de venda do produto:");
           precoVenda = leitor.nextFloat();
           
           if(precoCusto == precoVenda){
               System.out.println("Houve empate sobre os preços");
           }else{
               if(precoCusto>precoVenda){
                   System.out.println("Houve prejuízo");
               }else{
                   System.out.println("Houve lucro");
               }
           }
           
           totalCusto = totalCusto + precoCusto;
           totalVenda = totalVenda + precoVenda; 
           
       }
            
            System.out.println("A média do preço de custo é de R$ " 
                    + (mediaCusto = totalCusto / contador));
            System.out.println("A média do preço de venda é de R$ " 
                    + (mediaVenda = totalVenda / contador));
       
    }
    
}
