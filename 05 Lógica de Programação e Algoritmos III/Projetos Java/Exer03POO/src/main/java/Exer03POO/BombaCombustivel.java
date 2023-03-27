/*
3. Crie uma classe para representar uma BombaCombustivel. A classe
BombaCombustivel deve conter os seguintes atributos: tipo de combustível, valor
por litro e quantidade de combustível. Além desses atributos a classes deve
conter os seguintes métodos. 
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e 
mostra a quantidade de litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de 
combustível e mostra o valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
Crie uma classe que contenha um método main para testar sua classe BombaCombustível
 */
package Exer03POO;

import java.util.Scanner;

public class BombaCombustivel {
    
    private char tipoCombustivel;
    private float valorPlitro;  
    private float qtdCombustivel;
    
    Scanner leitor = new Scanner(System.in);
    
    /*
    a. abastecerPorValor; //método onde é informado o valor a ser abastecido e 
    mostra a quantidade de litros que foi colocada no veículo
    */
    public void abastecerPorValor(){
        float valor;       
        System.out.println("Informe o valor a ser abastecido: R$");
        valor = leitor.nextFloat();
        System.out.println("Você abastecerá " + valor/this.valorPlitro + 
                " litros");
    }
    
    /*
    b. abastecerPorLitro; // método onde é informado a quantidade em litros de 
    combustível e mostra o valor a ser pago pelo cliente.
    */
    public void abastecerPorLitro(){
        float qtdLitros;       
        System.out.println("Informe a quantidade de litros a ser abastecido:");
        qtdLitros = leitor.nextFloat();
        System.out.println("Saldo a pagar R$ " + qtdLitros*this.valorPlitro);        
    }
    
    /*
    c. alterarValor; //altera o valor do litro do combustível.
    */
    public void alterarValor(){
        System.out.println("Informe o valor do litro do combustível: R$");
        this.valorPlitro = leitor.nextFloat();    
    }
    
    /*
    d. alterarCombustivel; //altera o tipo do combustível.
    */
    public void alterarCombustivel(){
        System.out.println("Informe o tipo do combustível: "
                + "G- Gasolina | E- Etanol | D- Diesel");
        this.tipoCombustivel = leitor.next().charAt(0);    
    }
    
    /*
    e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
    */
    public void alterarQuantidadeCombustivel(){
        System.out.println("Informe a quantidade de combustível na Bomba:");
        this.qtdCombustivel = leitor.nextFloat();
    }
    
    

//Métodos Getter e Setter

    public char getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(char tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorPlitro() {
        return valorPlitro;
    }

    public void setValorPlitro(float valorPlitro) {
        this.valorPlitro = valorPlitro;
    }

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }
  
}
