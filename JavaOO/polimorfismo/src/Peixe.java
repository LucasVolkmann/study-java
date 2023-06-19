public class Peixe extends Animal{

    private String corEscama;

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe tocando guitarra");
    }

    @Override
    public void locomover() {
        System.out.println("Peixe tirando um racha dentro de um UP tsi");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
