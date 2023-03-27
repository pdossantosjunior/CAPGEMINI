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

public class Main {

    public static void main(String[] args) {
        
        int opcao;
        boolean repeticao = true;
        
        Elevador e = new Elevador();
                
        Scanner leitor = new Scanner(System.in);
        
        while(repeticao==true){
            
            System.out.println("Informe a opção desejada");
            System.out.println("1- Configuração do elevador");
            System.out.println("2- Entrada de pessoas");
            System.out.println("3- Saida de pessoas");
            System.out.println("4- Subir");
            System.out.println("5- Descer");
            System.out.println("0- Fechar o menu");
            opcao = leitor.nextInt();
            
            switch(opcao){
                case 1:
                    e.Inicializa();
                    break;
                case 2:
                    e.Entra();
                    break;
                case 3:
                    e.Sai();
                    break;
                case 4:
                    e.Sobe();
                    break;
                case 5:
                    e.Desce();
                    break;
                default:
                    repeticao = false;
                    break;
            }
        System.out.println("");
        System.out.println("O elevador está no andar: " + e.getAndarAtual());
        System.out.println("Sua lotação atual é de: " + e.getLotacaoAtual() +
                " pessoas.");
        System.out.println("");
        }     
    }
}


