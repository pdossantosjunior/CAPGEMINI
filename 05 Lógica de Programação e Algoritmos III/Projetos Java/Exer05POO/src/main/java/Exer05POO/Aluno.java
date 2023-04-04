/*
Escreva uma classe cujos objetos representam alunos matriculados em uma
disciplina. Cada objeto dessa classe deve guardar os seguintes dados do 
aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho
tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se 
ele não for para a final)
 */
package Exer05POO;

public class Aluno {
    
    private int matricula;
    private String nomeAluno;
    private float prova1, prova2, trabalho;
    
    public float media(){
        float media;        
        media=(this.prova1+this.prova2)/2;
        return media;
    }
    
    
    
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }
  
}
