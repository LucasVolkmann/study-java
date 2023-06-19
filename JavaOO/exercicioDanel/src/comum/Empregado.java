package comum;

public abstract class Empregado {
    
    private String nome;
    private Endereco endereco;

    public abstract double calcularSalario();

    public Empregado(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Empregado [nome=" + nome + ", endereco=" + endereco + "]";
    }

}
