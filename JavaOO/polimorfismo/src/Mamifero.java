public class Mamifero extends Animal{

    private String corPelo;
    
    //-----------------------Métodos Sobrescritos
    @Override
    public void alimentar() {
        System.out.println("Mamifero se alimentando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Mamifero trocando ideia no Discord");
    }
    @Override
    public void locomover() {
        System.out.println("Mamifero fazendo o pulo da van na B da mirage");
    }
    //-----------------------GET E SET
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
