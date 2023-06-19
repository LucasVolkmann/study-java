public class Caneta {

    //Atributos
    private String modelo;
    private float ponta;
    
    //Construtor recebendo 2 parâmetros, que vão definir o modelo 
    //e a ponta da caneta
    public Caneta(String s,float f) {
        this.modelo = s;
        this.ponta = f;
    }

    //Getters
    public String getModelo(){
        return this.modelo;
    }
    
    public float getPonta(){
        return this.ponta;
    }

    //Setters
    public void setModelo(String m){
        this.modelo = m;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    //Métodos Gerais
    public void status(){
        System.out.println(
            "modelo: "+this.getModelo()+
            "\nponta: "+this.getPonta()
        );
    }

    

}
