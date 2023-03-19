/**
 * Material da aula 4E
 */

package ComandosLeituraGravacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine(); //Lê uma frase inteira
        String codigoRua = leitor.next(); //Lê uma palavra
        
        System.out.println("Exibição no console."); //Imprime e quebra a linha
        System.out.print("Exibição no console."); //Imprime e mantem o cursor na linha
                
        
    }
    
}
