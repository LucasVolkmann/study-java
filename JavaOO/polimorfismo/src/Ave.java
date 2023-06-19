public class Ave extends Animal{

    private String corPena;

    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave piando");
    }

    @Override
    public void locomover() {
        System.out.println("Ave voando");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
