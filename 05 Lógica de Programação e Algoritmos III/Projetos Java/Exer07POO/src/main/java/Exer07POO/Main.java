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

public class Main {

    public static void main(String[] args) {

        Funcionario func = new Funcionario("Paulo", "César", 0.0f);

        func.setSalario(-1000.0f);
        System.out.println("Olá " + func.getNome() + " " + func.getSobrenome() + " seu salário é R$ " + func.getSalario());
    }

}
