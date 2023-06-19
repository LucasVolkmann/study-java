public class Aluno extends Pessoa{

    //-----------------------Atributos
    private String matr, curso;

    //-----------------------Métodos Comuns
    public void cancelarMatricula(){
        System.out.println("Matricula CANCELADA");
    }

    //-----------------------Contrutor
    public Aluno(){}

    //-----------------------Get & Set
    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
