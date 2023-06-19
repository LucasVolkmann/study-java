public class App {
    public static void main(String[] args) throws Exception {
        
        //Instânciando o Objeto
        Caneta c = new Caneta("Fluminense", 0.5f);
        
        //Mostrando os valores atribuidos pelo método construtor
        c.status();

        //Alterando os atributos 
        c.setModelo("AZUL CANETA");
        c.setPonta(15.5f);

        //Mostrando novamente os valores mas agora alterados pelos getters
        c.status();

    }
}
