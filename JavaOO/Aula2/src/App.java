public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.destampar();
        c1.rabiscar();
        c1.status();
    
    
        Caneta c2 = new Caneta();
        c2.tampar();
        c2.rabiscar();
    
    }
}
