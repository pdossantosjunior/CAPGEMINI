/*
7. A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
três informações a seguir como atributos:

a. um primeiro nome,
b. um sobrenome
c. um salário mensal

Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste
que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada
instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
empregado.
 */
package Exer07POO;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private Float salario;

    public Funcionario(String nome, String sobrenome, Float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {

        if (salario >= 0) {
            this.salario = salario;
        } else {
            this.salario = 0.0f;
        }

    }

}
