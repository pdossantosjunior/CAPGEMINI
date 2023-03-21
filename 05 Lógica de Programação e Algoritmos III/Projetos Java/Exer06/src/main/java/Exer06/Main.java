/*
 6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores
de forma que a variável A passe a possuir o valor da variável B e a variável B
passe a possuir o valor da variável A. Apresentar os valores trocados;
 */
package Exer06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        float a = 0.0f, b = 0.0f, c = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um valor: ");
        a = leitor.nextFloat();
        System.out.println("informe um segundo valor: ");
        b = leitor.nextFloat();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("Os valores informados foram invertidos e por isso"
                + " o primeiro agora é " + a + " e o segundo é " + b);
        
        
        
        
    }
    
}
