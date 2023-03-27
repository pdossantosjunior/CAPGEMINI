/*
1. Crie uma classe para representar uma Pessoa com os atributos privados
de nome, data de nascimento e altura. Crie os métodos públicos necessários
para getters e setters e também um método para imprimir todos dados de uma
pessoa. Crie um método para calcular a idade da pessoa.
 */
package Exer01POO;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        
        p.setNome("Paulo César");
        p.setAltura(1.80f);
        p.setDataNascimento(new Date());
        
        p.imprimir();
        
        
    }
    
}
