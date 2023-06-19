public class Aluno extends Pessoa{

    //Atributos
    protected String matricula, curso;

    //Método Comum
    public void pagarMensalidade(){
        System.out.println("A mensalidade do aluno "+this.nome+" foi paga!!");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    
}
