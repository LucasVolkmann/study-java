import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner t = new Scanner(System.in); 


        System.out.print("Escolha o número de repetições:");
        int a = t.nextInt();
        
        int c = 2;

        while(c<a){
            if(c%2==0 || c%3==0 || c%5==0 || c%7==0){
                if(c==2||c==3||c==5||c==7){
                    System.out.println(c);
                }
            c++;
            continue;
            }
        System.out.println(c);
        c++;
        }
    
    }
}
