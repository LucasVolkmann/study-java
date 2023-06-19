package empregado;

import comum.Empregado;
import comum.Endereco;

public class Chefe extends Empregado{

    private int qtdColaboradores;
    private double salarioMensal;
    
    @Override
    public double calcularSalario(){
        return salarioMensal;
    }

    public Chefe(String nome, Endereco endereco,int qtdColaboradores) {
        super(nome, endereco);
        this.salarioMensal = qtdColaboradores *100;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public int getQtdColaboradores() {
        return qtdColaboradores;
    }

    public void setQtdColaboradores(int qtdColaboradores) {
        this.qtdColaboradores = qtdColaboradores;
    }
    
    @Override
    public String toString() {
        return "Chefe [qtdColaboradores=" + qtdColaboradores + ", salarioMensal=" + salarioMensal + "]";
    }

}
