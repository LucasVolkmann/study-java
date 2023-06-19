public class App {
    public static void main(String[] args) throws Exception {
        
        //Instânciando Pessoa
        int i=2;
        Pessoa p[] = new Pessoa[i];
        p[0] = new Pessoa("Cleiton",30,"Bi não binarie");
        p[1] = new Pessoa("Paulo Henrique Ganso",86,"Maestro");

        //Instanciândo Livro
        Livro l[] = new Livro[1];
        l[0] = new Livro("1984","George Orwell",414,p[0]);

        l[0].folhear(50);
        l[0].abrir();
        l[0].folhear(413);
        l[0].avançarPag();
        l[0].fechar();

        System.out.println("----------RESULT---------");
        l[0].detalhes();

    }
}

