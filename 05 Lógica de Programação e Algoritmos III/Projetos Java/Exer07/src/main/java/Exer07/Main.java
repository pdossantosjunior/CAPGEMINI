/*
 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus
Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em
Fahrenheit e C a temperatura em Celsius;
 */
package Exer07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       float temperatura;
       
       Scanner leitor = new Scanner(System.in);
       
       System.out.println("Informe a temperatura em Celsius: ");
       temperatura = leitor.nextFloat();
       System.out.println("A temperatura informada convertida para"
               + " Fahrenheit é " + (((9 * temperatura) + 160) / 5)  + "º F.");
       
    }
    
}
