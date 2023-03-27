/*
2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir
os seguintes atributos: número da conta, nome do correntista e saldo. Os métodos
são os seguintes: alterarNome, depósito e saque; No construtor, saldo é 
opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package Exer02POO;

public class Main {

    public static void main(String[] args) {
        
        ContaCorrente c = new ContaCorrente(0001, "João Paulo" , 25.0f);
        
        System.out.println("Olá " + c.getNomeCorrentista());
        System.out.println("Seu saldo atual é " + c.getSaldoConta());
        System.out.println("Fazendo um deposito de R$ 25,00");
        c.deposito(25.0f);
        System.out.println("Seu saldo atual é " + c.getSaldoConta());
        System.out.println("Fazendo um saque de R$ 31,00");
        c.saque(31.0f);
        System.out.println("Seu saldo atual é " + c.getSaldoConta());
        System.out.println("Alterando o nome para Paulo");
        c.alterarNome("Paulo");
        System.out.println("Olá " + c.getNomeCorrentista());
    }
    
}
