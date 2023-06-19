public class Caneta {

    //Atributos da minha classe
    //Características do meu Objeto
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private  boolean tampada; 

    //Métodos da minha classe
    //Coisas que meu objeto faz
    public void status(){
        System.out.println("modelo: "+this.modelo);
        System.out.println("cor: "+this.cor);
        System.out.println("ponta: "+this.ponta);
        System.out.println("carga: "+this.carga);
        System.out.println("tampada: "+this.tampada);
    }
     protected void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO");
        }else {
            System.out.println("Rabisco");
        }
    }
    
    public void tampar(){
        this.tampada=true;
    }

    public void destampar(){
        this.tampada=false;
    }
}
