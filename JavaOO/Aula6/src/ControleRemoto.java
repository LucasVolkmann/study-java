public class ControleRemoto implements Controlador{
    
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos Especiais
    //Contrutor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Getters & Setters
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos implementados
    @Override
    public void abrirMenu() {
        System.out.println("Está ligado?"+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.println("Volume: "+this.getVolume());
        System.out.print("Volume: 0%|");
        for (int c=0;c<this.getVolume();c+=10){
            System.out.print("=");
        }
        System.out.print(this.getVolume()+"%");
        for(int i=100;i>this.getVolume();i-=10){
            System.out.print("-");
        }
        System.out.print("|100%");
    }

    @Override
    public void desligar() {
    
    }

    @Override
    public void desligarMudo() {
    
    }

    @Override
    public void fecharMenu() {
    
    }

    @Override
    public void ligar() {
    
    }

    @Override
    public void ligarMudo() {
    
    }

    @Override
    public void maisVolume() {
    
    }

    @Override
    public void menosVolume() {
    
    }

    @Override
    public void pause() {
    
    }

    @Override
    public void play() {
    
    }


}
