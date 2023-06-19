public class App {
    public static void main(String[] args) throws Exception {
        
        //Intânciar os clientes
        //Jubileu, Poupança, 300
        //Creusa, Corrente, 500 
        Conta jubileu = new Conta(0,"cp", "Jubileu");
        Conta creusa = new Conta(1,"cc", "Creusa"); 


        //Dados das contas, sem nenhuma intervenção
        jubileu.dados();
        creusa.dados();

        //Tentando alterar algo com a conta fechada ( "  Jubileu  " )
        jubileu.depositar(500);
        jubileu.sacar(1000);
        jubileu.fecharConta();
        jubileu.pagarMensal();

        //Tentando alterar algo com a conta fechada ( "  Creusa  " )
        creusa.depositar(1);
        creusa.sacar(400);
        creusa.fecharConta();
        creusa.pagarMensal();
        
        //Dados depois das tentativas
        creusa.dados();
        jubileu.dados();

        //Abertura de contas, deposito dos respectivos valores e pagamento da mensalidade
        jubileu.abrirConta("cp");
        jubileu.depositar(300);
        jubileu.pagarMensal();

        creusa.abrirConta("cc");
        creusa.depositar(500);
        creusa.pagarMensal();

        creusa.dados();
        jubileu.dados();
        System.out.println();

        //Tentando fechar as contas
        jubileu.fecharConta();
        creusa.fecharConta();

        creusa.sacar(538);
        creusa.fecharConta();
        creusa.dados();
    }
}
