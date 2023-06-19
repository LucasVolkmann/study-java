public class Bolsista extends Aluno{

    private String bolsa;

    public void renovarBolsa(){
        System.out.println("A bolsa de "+this.nome+" foi renovada");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("A mensalidade do bolsista "+this.nome+" foi paga");
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    
    
}
