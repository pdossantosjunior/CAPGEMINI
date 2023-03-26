/*
32. Escreva um algoritmo que leia três valores inteiros e verifique se eles
podem ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo
que eles formam: equilátero, isóscele ou escaleno. Propriedade: o comprimento
de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros
dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados
   diferentes;
 */
package Exer32;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int lado1=0, lado2=0, lado3=0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o comprimento do primeiro lado do triângulo:");
        lado1 = leitor.nextInt();
        System.out.println("Informe o comprimento do segundo lado do triângulo:");
        lado2 = leitor.nextInt();
        System.out.println("Informe o comprimento do terceiro lado do triângulo:");
        lado3 = leitor.nextInt();
        
        if(lado1<=lado2+lado3 && lado2<=lado1+lado3 && lado3<=lado1+lado2){
            if(lado1==lado2 && lado1==lado3){
                System.out.println("É um triângulo Equilátero!");                
            }else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
                System.out.println("É um triângulo Isóscele!");                                
            }else{
                System.out.println("É um triângulo Escaleno!");
            }            
        }else{
            System.out.println("Pelas medidas informadas, não é um triângulo!");
        }
        
    }
    
}
