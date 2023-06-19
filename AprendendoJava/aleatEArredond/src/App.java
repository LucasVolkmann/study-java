import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("Escolha cara ou coroa(0=cara | 1=coroa): ");
        int num = t.nextInt();
        
        float ale = (float) Math.random();
        System.out.println(ale);
        int moeda = Math.round(ale);

        System.out.println("num = "+num+"\n"+"moeda= "+moeda);
        System.out.println(num==moeda?"Você venceu!!":"Você perdeu!!");

    }
}
