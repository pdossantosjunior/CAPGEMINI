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
package Exer08POO;

import java.time.LocalDate;
import java.time.Month;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Data(int dia, int mes, int ano) {
        if (isValidDate(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    // Método para verificar se a data é válida
    private boolean isValidDate(int dia, int mes, int ano) {
        try {
            LocalDate.of(ano, mes, dia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Método para comparar duas datas
    public int compara(Data outraData) {
        LocalDate dataCorrente = LocalDate.of(this.ano, this.mes, this.dia);
        LocalDate outraDataLocalDate = LocalDate.of(outraData.ano, outraData.mes, outraData.dia);
        return dataCorrente.compareTo(outraDataLocalDate);
    }

    // Método para retornar o dia da data
    public int getDia() {
        return this.dia;
    }

    // Método para retornar o mês da data
    public int getMes() {
        return this.mes;
    }

    // Método para retornar o mês da data corrente por extenso
    public String getMesExtenso() {
        return Month.of(this.mes).name();
    }

    // Método para retornar o ano da data
    public int getAno() {
        return this.ano;
    }

    // Método para verificar se o ano é bissexto
    public boolean isBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || this.ano % 400 == 0;
    }

    // Método para clonar o objeto
    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }
}

