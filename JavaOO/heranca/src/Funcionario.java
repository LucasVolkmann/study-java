public class Funcionario extends Pessoa{

    //-----------------------Atributos
    private String setor;
    private boolean trabalhando;
    
    //-----------------------Métodos Comuns
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }

    //-----------------------Construtor
    public Funcionario(){}

    //-----------------------Get & Set
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
