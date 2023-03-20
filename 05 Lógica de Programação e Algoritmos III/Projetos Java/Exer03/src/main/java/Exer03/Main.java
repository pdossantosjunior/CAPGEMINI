/*
3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo
fornecida a distância total percorrida pelo automóvel e o total de combustível
gasto;
 */
package Exer03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float distancia, combustivel;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a distância total percorrida: ");
        distancia = leitor.nextInt();
        System.out.println("Informe a quantidade de combustível usada: ");
        combustivel = leitor.nextInt();
        System.out.println("O consumo médio foi de : " + (distancia / combustivel) + " KM/L");
        
    }
    
}