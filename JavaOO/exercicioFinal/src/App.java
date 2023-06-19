public class App {
    public static void main(String[] args) throws Exception {
        
        //-------------------Declarar 3 instancias de Video
        Video v[] = new Video[3];
        v[0] = new Video("Top 5 Monkeys");
        v[1] = new Video("Como fazer maconha com maisena e JS");
        v[2] = new Video("Melhores momentos Fluminense 5x1 River Plate");

        //-------------------Declarar 2 instancias de Gafanhoto
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("German Cano", 5000, "Goleador", "fazueli");
        g[1] = new Gafanhoto("Richard Feynman",105,"m","1965lixo");
        
        //-------------------Declarar 3 Visualizações
        Visualizacao s[] = new Visualizacao[10];
        s[0] = new Visualizacao(g[0], v[0]);
        s[1] = new Visualizacao(g[0], v[0]);
        s[2] = new Visualizacao(g[0], v[2]);
        s[3] = new Visualizacao(g[0], v[0]);
        s[4] = new Visualizacao(g[0], v[2]);


 

        s[0].avaliar(10);
        s[0].avaliar(0);
        s[0].avaliar(5);
        s[0].like();
        s[0].play();

        


        System.out.println(s[0].toString());

        /*
        //-------------------Amostrar na tela
        System.out.println("VIDEOS\n------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
         */
    
    }
}
