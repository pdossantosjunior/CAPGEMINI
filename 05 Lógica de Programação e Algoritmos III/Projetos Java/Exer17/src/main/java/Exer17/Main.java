/*
17. Leia 80 números e ao final informe quanto(s) número(s) está(ão) no
intervalo entre 10 (inclusive) e 150 (inclusive);
 */
package Exer17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero, entreNumeros = 0, contador = 5;     //Coloquei um contador para facilitar a vida.
               
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 1; i <= contador; i++){
            
            System.out.println("Informe o " + i + "º número inteiro:");
            numero = leitor.nextInt();
            
            if(numero >= 10 && numero <= 150){
                entreNumeros = entreNumeros + 1;
            }else{
                
            }

        }
        
        System.out.println("Há " + entreNumeros + " números no intervalo entre"
                + " 10 e 150.");

    }
    
}
