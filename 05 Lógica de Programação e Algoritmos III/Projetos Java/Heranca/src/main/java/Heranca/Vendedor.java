package Heranca;

import java.util.Date;

public class Vendedor extends Funcionario { /*extends Funcionario -- a classe
                    Vendedor está herdando os atributos da classe Funcionario*/
    
    //Atributos//
    private int totalItensVendidos;
    private float comissaoPorItem;
    
    //Método Contrutor//
    public Vendedor(){
        super();
    }
    
    public float calcularSalario(){
        
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }
 
    /*
    Métodos acessores
    para adicionar o código automaticamente precione "Alt + Insert" 
    e selecione "Getter and Setter" e selecione os atributos.
    */

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }

  
 
}
