/*
1. Crie uma classe para representar uma Pessoa com os atributos privados
de nome, data de nascimento e altura. Crie os métodos públicos necessários
para getters e setters e também um método para imprimir todos dados de uma
pessoa. Crie um método para calcular a idade da pessoa.
 */
package Exer01POO;

import java.util.Date;

public class Pessoa {
    
    private String nome;
    private Date dataNascimento;
    private float altura;
    
    
    public void imprimir(){
        
        System.out.println("Nome da pessoa: " + this.nome);
        System.out.println("Altura da pessoa: " + this.altura + " m");
        System.out.println("Data de Nascimento da pessoa: " + this.dataNascimento);
    }
       
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
