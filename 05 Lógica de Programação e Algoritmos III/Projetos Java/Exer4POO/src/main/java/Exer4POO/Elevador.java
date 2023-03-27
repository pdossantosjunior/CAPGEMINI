/*
4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
disponibilizar os seguintes métodos:

a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);
 */
package Exer4POO;

import java.util.Scanner;

public class Elevador {
    
    private int andarAtual;
    private int totalAndar;
    private int lotacaoTotal;
    private int lotacaoAtual;
    
    Scanner leitor = new Scanner(System.in);
    
    /*
    a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
    prédio (os elevadores sempre começam no térreo e vazio);
    */
    public void Inicializa(){
        System.out.println("Informe qual é a lotação total do elevador:");
        this.lotacaoTotal = leitor.nextInt();
        System.out.println("Informe quantos andares o prédio tem além do térreo:");
        this.totalAndar = leitor.nextInt();
        this.andarAtual=0;
        this.lotacaoAtual=0;
    }
    
    /*
    b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    */
    public void Entra(){
        System.out.println("Informe quantas pessoas desejam entrar no elevador:");
        int entra = leitor.nextInt();
        
        if((this.lotacaoAtual + entra) <= lotacaoTotal){
            System.out.println("Ok, podem entrar!");
            this.lotacaoAtual = lotacaoAtual + entra;
        }else{
            System.out.println("O elevador não comporta a quantidade desejada!");
        }
    }
    
    /*
    c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    */
    public void Sai(){
        System.out.println("Informe quantas pessoas desejam sair do elevador:");
        int sair = leitor.nextInt();
        
        if(this.lotacaoAtual < sair){
            System.out.println("Não há esse tanto de pessoas!");
        }else{
            System.out.println("Ok, obrigado por informar!");
            this.lotacaoAtual = lotacaoAtual - sair;    
        }
    }
    
    /*
    d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
    */
    public void Sobe(){
        System.out.println("Informe para qual andar deseja ir:");
        int sobe = leitor.nextInt();
        
        if(this.andarAtual <= sobe){
            if(this.totalAndar < sobe){
            System.out.println("O andar informado não existe!");            
            }else if(this.andarAtual == sobe){
                if(sobe == 0){
                System.out.println("Você(s) já está(ão) no térreo!");
                }else{
                System.out.println("Você(s) já está(ão) no andar selecionado!");
                } 
            }else{
                System.out.println("Subindo!");
                this.andarAtual=sobe;
            }      
        }else{
            System.out.println("Você(s) está(ão) em um andar superior ao "
                    + "informado, utilize a opção Descer!");    
        }
    }
    
    /*
    e. Desce: para descer um andar (não deve descer se já estiver no térreo);
    */
    public void Desce(){
        System.out.println("Informe para qual andar deseja ir:");
        int desce = leitor.nextInt();
        
        if(this.andarAtual >= desce){
            if(0 > desce){
                System.out.println("O andar informado não existe!");            
            }else if(this.andarAtual == desce){
                if(desce == 0){
                    System.out.println("Você(s) já está(ão) no térreo!");
                }else{
                System.out.println("Você(s) já está(ão) no andar selecionado!");
                } 
            }else{
                System.out.println("Descendo!");
                this.andarAtual=desce;
            }
        }else{
            System.out.println("Você(s) está(ão) em um andar inferior ao "
                    + "informado, utilize a opção Subir!");            
        }
    }
    
    
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndar() {
        return totalAndar;
    }

    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    public int getLotacaoTotal() {
        return lotacaoTotal;
    }

    public void setLotacaoTotal(int lotacaoTotal) {
        this.lotacaoTotal = lotacaoTotal;
    }

    public int getLotacaoAtual() {
        return lotacaoAtual;
    }

    public void setLotacaoAtual(int lotacaoAtual) {
        this.lotacaoAtual = lotacaoAtual;
    }    
}
