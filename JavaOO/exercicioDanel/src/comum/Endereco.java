package comum;

public class Endereco {
    
    private String estado, cidade, bairro, rua, numero, compremento;

    public Endereco(String estado, String cidade, String bairro, String rua, String numero, String compremento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.compremento = compremento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCompremento() {
        return compremento;
    }

    public void setCompremento(String compremento) {
        this.compremento = compremento;
    }

    @Override
    public String toString() {
        return "Endereco [estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero="
                + numero + ", compremento=" + compremento + "]";
    }

}
