public class Livro implements Publicacao{

    private String titulo, autor;
    private int totalPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //------------------------Métodos Gerais

    
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", totalPag=" + totalPag + ", pagAtual=" + pagAtual
                + ", aberto=" + aberto + ", leitor=" + leitor + "]";
    }
    
    public void detalhes(){

        String stat = this.isAberto()?"Aberto":"Fechado";

        System.out.println(
            "Título: "+this.getTitulo()+
            "\nAutor: "+this.getAutor()+
            "\nTotal de Páginas: "+this.getTotalPag()+
            "\nPágina Atual: "+this.getPagAtual()+
            "\nNo momento ele está "+stat+
            "\nNome do leitor no livro: "+leitor.getNome()        
            );

    }

    //------------------------Métodos Implementados

    @Override
    public void abrir() {
        if(!this.isAberto()){
            this.setAberto(true);
        }else{
            System.out.println("O livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            this.setAberto(false);
        }else{
            System.out.println("O livro já está fechado");
        }
    }

    @Override
    public void folhear(int f) {
        if(this.isAberto() && f <= this.getTotalPag()){
            this.setPagAtual(f);
        }else{
            System.out.println("ERRO folhear");
        }
    }


    @Override
    public void avançarPag() {
        if(this.isAberto() && this.getPagAtual() < this.getTotalPag()){
            this.setPagAtual(this.getPagAtual()+1);
        }else{
            System.out.println("ERRO ao avançar pagina");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && this.getPagAtual() > 1){
            this.setPagAtual(this.getPagAtual()-1);
        }else{
            System.out.println("ERRO ao voltar pagina");
        }
    }

    //------------------------Métodos Especiais

    public Livro(String t, String a, int tp, Pessoa p){
        this.setTitulo(t);
        this.setAutor(a);
        this.setTotalPag(tp);
        this.setLeitor(p);
        this.setPagAtual(0);
        this.setAberto(false);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
