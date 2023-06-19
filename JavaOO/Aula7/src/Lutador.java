public class Lutador{

    //------------------ ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //------------------ CONSTRUTOR
    public Lutador(
        String no,
        String na,
        int id,
        float al,
        float pe,
        int vi,
        int de,
        int em
    ){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    //--------------- GETTERS & SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {

        float pesoset=this.getPeso();
        if(pesoset<52.2){
            this.categoria="Inválido";
        }else if(pesoset<=70.3){
            this.categoria="Leve";
        }else if(pesoset<=83.9){
            this.categoria="Médio";
        }else if(pesoset<=120.2){
            this.categoria="Pesado";
        }else{
            this.categoria="Inválido";
        }

    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //------------------- MÉTODOS GERAIS
    public void apresentar(){
        System.out.println("---------Apresentar---------");
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+"m de altura");
        System.out.println("Pesando "+this.getPeso()+"Kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
    }

    public void status(){
        System.out.println("----------Status----------");
        System.out.print(this.getNome());
        System.out.print(" é um peso "+this.getCategoria());
        System.out.print(" "+this.getVitorias()+" vitórias");
        System.out.print(" "+this.getDerrotas()+" derrotas");
        System.out.print(" "+this.getEmpates()+" empates\n");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

}