public abstract class Pessoa {

    //Atributos protegidos, o uso é permitido apenas para as subclasses de Pessoa
    protected String nome, sexo;
    protected int idade;

    //Método Comum
    public void fazerAniv(){
        this.idade++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
