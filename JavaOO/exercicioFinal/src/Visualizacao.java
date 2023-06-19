public class Visualizacao {
    
    private Gafanhoto espectador;
    private Video filme;

    public void play(){
        this.filme.play();
    };
    public void like(){
        this.filme.like();
    };
    public void pause(){
        this.filme.pause();
    };
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){

        int notaP=0;

        if(porc <=20){
            notaP=2;
        }else if(porc <=40){
            notaP=4;
        }else if(porc <=60){
            notaP=6;
        }else if(porc <=80){
            notaP=8;
        }else { 
            notaP=10;
        }

        this.filme.setAvaliacao(notaP);
    }
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.filme.setViews( this.filme.getViews() + 1 );
        this.espectador.setTotAssistido( this.espectador.getTotAssistido() + 1 );
    }
    
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "\n------------------------------\nVisualizacao [espectador=" + espectador + ", filme=" + filme + "]\n------------------------------";
    }

    
    
}
