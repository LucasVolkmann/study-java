public class Luta {

    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada=false;
    
    //MÉTODOS
    public void marcarLuta(Lutador l1,Lutador l2){


        if(l1!=l2 && l1.getCategoria()==l2.getCategoria()){

            aprovada=true;
            desafiado = l1;
            desafiante = l2;

        }else {

            aprovada = false;
            desafiado=null;
            desafiante=null;
            System.out.println("A luta não pôde ser marcada!");

        }


    }
    public void lutar(){


        if(this.aprovada){

            //Gerando dois números aleatorios e inserindo eles em 2 variáveis.
            double ran1 = Math.random();
            double ran2 = Math.random();

            //Definindo o número de rounds (de 1 a 5) com o primeiro numero aleatorio vezes 5 (*5) e 
            //arredondado para cima (Math.ceil).
            int r = (int) Math.ceil(ran1*5);
            this.setRounds(r);

            //Definindo o segundo número aleatório sendo 1, 2 ou 3 (Math.ceil(ran2 * 3))
            int ale = (int) Math.ceil(ran2*3);

            //Apresentação de ambos os lutadores chamando o método apresentar() da Classe Lutador.
            this.desafiado.apresentar();
            System.out.println("----------------------------");
            this.desafiante.apresentar();

            //Definindo o resultado da luta
                switch(ale){
                    case 1:
                    System.out.println("---------------------------\n"+
                                    "A Luta terminou empatada!!!\n"+
                                    "---------------------------");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    case 2:
                    System.out.println("---------------------------\n"+this.desafiado.getNome()+
                                    " ganhou a luta no "+this.getRounds()+"º round!!!\n"+
                                    "---------------------------");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    case 3:
                    System.out.println("---------------------------\n"+this.desafiante.getNome()+
                                    " ganhou a luta no "+this.getRounds()+"º round!!!\n"+
                                    "---------------------------");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                }
        } else{
            System.out.println("A luta não pode acontecer");
        }


    }
    
    //CONTRUTOR
    public Luta(){

    }
    
    //GETTERS & SETTERS
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
    
  

}
