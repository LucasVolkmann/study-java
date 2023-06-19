public class App {
    public static void main(String[] args) throws Exception {
        
        int contagem = 0;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                contagem++;
                System.out.println(contagem);
                System.out.println("i="+i+" | j="+j);
            }
        }
        System.out.println("RESULTADO: "+contagem);
    }
}
