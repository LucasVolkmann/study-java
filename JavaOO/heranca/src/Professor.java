public class Professor extends Pessoa{

    //-----------------------Atributos
    private String especialidade;
    private double salario;
    
    //-----------------------Métodos Comuns
    public void receberAum(double aum){
        this.salario+=aum;
    }

    //-----------------------Construtor
    public Professor(){}

    //-----------------------Get & Set
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
