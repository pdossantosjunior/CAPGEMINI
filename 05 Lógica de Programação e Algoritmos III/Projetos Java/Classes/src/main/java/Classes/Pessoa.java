package Classes;

public class Pessoa {
    
    //Atributos da classe//
    private float peso; //Estão private para que assim não seja possível alterá-los de fora da classe.
    private float altura;
    
    //Método construtor - deve ter o nome da classe
    public Pessoa(){
        System.out.println("Executando o método construtor!");
    }
    
    //Método da classe para calcular o IMC//
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc; 
    }
    
    //Métodos de acesso a classe
    public void setPeso(float peso){
        this.peso = peso;
    } 
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return altura;
    }
}
