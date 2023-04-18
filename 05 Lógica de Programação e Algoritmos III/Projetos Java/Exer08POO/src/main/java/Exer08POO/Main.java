/*
8. Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos
seguintes métodos:

a. Construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a
data está correta, caso não esteja a data é configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e
retorne:
i. 0 se as datas forem iguais;
ii. 1 se a data corrente for maior que a do parâmetro;
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
mesmos valores de atributos e retorna sua referência pelo método
 */
package Exer08POO;  //Fiz com a ajuda do ChatGPT

public class Main {

    public static void main(String[] args) {
        // Criação de duas datas para comparação
        Data data1 = new Data(30, 2, 2000);
        Data data2 = new Data(17, 4, 2023);

        // Teste dos métodos
        System.out.println("Dia da data1: " + data1.getDia());
        System.out.println("Mês da data1: " + data1.getMes());
        System.out.println("Mês da data1 por extenso: " + data1.getMesExtenso());
        System.out.println("Ano da data1: " + data1.getAno());
        System.out.println("A data1 é bissexta? " + data1.isBissexto());

        System.out.println("Dia da data2: " + data2.getDia());
        System.out.println("Mês da data2: " + data2.getMes());
        System.out.println("Mês da data2 por extenso: " + data2.getMesExtenso());
        System.out.println("Ano da data2: " + data2.getAno());
        System.out.println("A data2 é bissexta? " + data2.isBissexto());

        System.out.println("Comparação entre as datas: " + data1.compara(data2));

        Data dataClone = data1.clone();
        System.out.println("Clone da data1: " + dataClone.getDia() + "/" + dataClone.getMes() + "/" + dataClone.getAno());
    }
    
}
