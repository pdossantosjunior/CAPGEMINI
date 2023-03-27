/*
2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir
os seguintes atributos: número da conta, nome do correntista e saldo. Os métodos
são os seguintes: alterarNome, depósito e saque; No construtor, saldo é 
opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package Exer02POO;

public class ContaCorrente {
    
    private int nrConta;
    private String nomeCorrentista;
    private float saldoConta;

    public ContaCorrente(int nrConta, String nomeCorrentista, float saldoConta) {
        this.nrConta = nrConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoConta = saldoConta;
    }
    
    
    public String alterarNome(String nome){
        this.nomeCorrentista = nome;
        return nomeCorrentista;
    }
    
    public float deposito(float deposito){
        this.saldoConta = saldoConta + deposito;
        return saldoConta;
    }
            
    public float saque(float saque){
        this.saldoConta = saldoConta - saque;
        return saldoConta;
    }

    
       
    
    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    
    
    
    
    
    
    
    
}
