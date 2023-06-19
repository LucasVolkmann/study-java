package empregado;

import comum.Empregado;
import comum.Endereco;

public class Funcionario extends Empregado{
    
    private int mesesEmpresa;
    private double salarioBase;

    @Override
    public double calcularSalario() {
        return this.salarioBase * (1 + ((mesesEmpresa/12)/100));
    }

    public Funcionario(String nome, Endereco endereco, int mesesEmpresa, double salarioBase) {
        super(nome, endereco);
        this.mesesEmpresa = mesesEmpresa;
        this.salarioBase = salarioBase;
    }

    public int getMesesEmpresa() {
        return mesesEmpresa;
    }

    public void setMesesEmpresa(int mesesEmpresa) {
        this.mesesEmpresa = mesesEmpresa;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario [mesesEmpresa=" + mesesEmpresa + ", salarioBase=" + salarioBase + "]";
    }
    

}
