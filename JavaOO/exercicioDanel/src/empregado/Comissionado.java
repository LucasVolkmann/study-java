package empregado;

import comum.Empregado;
import comum.Endereco;

public class Comissionado extends Empregado {

    private double salarioBase,comissao;
    private int quantidade;
    
    @Override
    public double calcularSalario(){
        return this.salarioBase + comissao;
    }
    
    public Comissionado(String nome, Endereco endereco, double salarioBase, int quantidade) {
        super(nome, endereco);
        this.salarioBase = salarioBase;
        this.quantidade = quantidade;
        this.comissao = quantidade * 50;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Comissionado [salarioBase=" + salarioBase + ", comissao=" + comissao + ", quantidade=" + quantidade
                + "]";
    }

}