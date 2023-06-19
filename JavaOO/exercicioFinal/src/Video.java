public class Video implements AcoesVideo{
    
    private String titulo;
    private int views, curtidas, avaliacao, coes;
    private boolean reproduzindo;
    
    @Override
    public void like() {
        this.curtidas++;
    }
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    @Override
    public void play() {
        this.reproduzindo = true;
    }
    
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.coes++;
        float nova = ((this.avaliacao*(this.coes-1)) + avaliacao)/this.coes;
        this.avaliacao = Math.round(nova);
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao
                + ", reproduzindo=" + reproduzindo + "]";
    }

}