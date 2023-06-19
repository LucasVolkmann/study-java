public class Conta {

    /* 
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
                        | MELHORIAS: |
      
    -> USAR OS MÉTODOS SETTERS E GETTERS PARA 
    DEFINIR E PEGAR UM ATRIBUTO.
    MOTIVO:

    -> NÃO ESCREVER NA TELA DENTRO DE MÉTODOS (ENCAPSULAMENTO)
    MOTIVO:

    -> PROFESSOR NÃO PASSOU PARÂMETROS NO MÉTODO
    CONSTRUTOR, APENAS SETOU ALGUMAS VAR E DEPOIS 
    DE INSTANCIAR O OBJETO SETOU TUDO PELOS MÉTODOS
    SETTERS
    MOTIVO:
    

      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */


    //--------------------- Atributos ------------------------------
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    private float mensalidade;

    //--------------------- Construtor -----------------------------
    public Conta(int num,String tip,String don){
        if(tip.equals("cc")){
            this.mensalidade = 12;
        }else if(tip.equals("cp")){
            this.mensalidade = 20;
        }else{
            tip="ERROR (tipo da conta é diferente de 'cc' ou 'cp')";
        }
        this.numConta = num;
        this.tipo = tip;
        this.dono = don;
        this.saldo = 0;
        this.status = false;
    }


    //---------------------- setters ------------------------------

    public void setNumConta(int num){
        this.numConta = num;
    } 
    public void setTipo(String stip){
        this.tipo = stip;
    }
    public void setDono(String scli){
        this.dono = scli;
    }
    public void setSaldo(float stot){
        this.saldo = stot;
    }
    public void setStatus(boolean stat){
        this.status = stat;
    }
    public void setMensalidade(float mens){
        this.mensalidade = mens;
    }
    
    
    //----------------------- getters ----------------------------

    public int getNumConta(){
        return this.numConta;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getDono(){
        return this.dono;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public boolean getStatus(){
        return this.status;
    }

    public float getMensalidade(){
        return this.mensalidade;
    }


    //--------------------- Métodos Gerais --------------------------
    public void abrirConta(String ti){

        if(!this.status){
            if(ti.equals("cc")){
                this.saldo+=50;
                this.status = true;
            }else if(ti.equals("cp")) {
                this.saldo=+150;
                this.status = true;
            }else{
                System.out.println("O tipo de conta informado não é válido. \n"+
                                    "Informe se a conta é corrente 'cc' ou poupança 'cp'");
            }
        }else{System.out.println("A conta já está aberta");}
    }

    public void fecharConta(){
        
        if(this.status){
        float saldofinal = this.saldo;
        if(saldofinal<0){
            System.out.println("Você não pode fechar a conta pois seu saldo é menor que zero");
        } else if(saldofinal>0){
            System.out.println("Para que possamos fechar a conta, o saldo deve estar zerado");
        }else{
            this.status = false;   this.mensalidade = 0;    this.tipo = ""; 
        }
        }else{System.out.println("A conta já está fechada");}

    }

    public void depositar(float d){
        if(this.status){
            this.saldo += d;
        }else{System.out.println("O deposito não pode ser feito porque a conta está fechada");}
    }

    public void sacar(float s){

        if(this.status){
            if(this.saldo>=s){
                this.saldo -= s;
            }else{
                System.out.println("O valor que se está querendo sacar é maior que o saldo da conta");
            }
        }else{
            System.out.println("O saque não pode ser feito porque a conta está fechada");
        }
    }

    public void pagarMensal(){
        if(this.status){
            this.saldo -= this.mensalidade;
        } else{System.out.println("Não foi possivel pagar a mensalidade de "+this.dono+" porque a conta está fechada.");}
    }

    public void dados(){
        
        String statustype=(this.status?"ABERTA":"FECHADA");

        System.out.println(
        "--------------------------------------"+
        "\n["+this.numConta+"] - Número da conta"+
        "\nNome do cliente: "+this.dono+
        "\nTipo de conta: "+this.tipo+
        "\nSaldo da conta: "+this.saldo+
        "\nStatus: "+statustype+
        "\nMensalidade: "+mensalidade+
        "\n--------------------------------------\n"
        );
    }

}
