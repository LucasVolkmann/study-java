public class Caneta {

    //Atributos da minha classe
    //Características do meu Objeto
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Métodos da minha classe
    //Coisas que meu objeto faz
    void status(){
        System.out.println("modelo: "+this.modelo);
        System.out.println("cor: "+this.cor);
        System.out.println("ponta: "+this.ponta);
        System.out.println("carga: "+this.carga);
        System.out.println("tampada: "+this.tampada);
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO");
        }else {
            System.out.println("Rabisco");
        }
    }
    
    void tampar(){
        this.tampada=true;
    }

    void destampar(){
        this.tampada=false;
    }
}
