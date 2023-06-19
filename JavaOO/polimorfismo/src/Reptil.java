public class Reptil extends Animal{

    private String corEscama;
    
    //-----------------------Métodos sobrescritos
    @Override
    public void alimentar() {
        System.out.println("Reptil se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Reptil mandando um verso na batalha da aldeia");
    }

    @Override
    public void locomover() {
        System.out.println("Reptil abrindo meio da Mirage de skate");
    }
    
    //------------------------GET E SET
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
