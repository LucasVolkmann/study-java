import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Objeto para ler as entradas de dados
        Scanner t = new Scanner(System.in);

        System.out.println("Olá eu sou o Gênio, tente acertar um número de 1 a 10:");
        int usu = t.nextInt();
        
        double ran = 1+Math.random()*10;
        int num = (int) ran;
        
        System.out.println(num==usu?"Parabéns você acertou o número!!! "+usu+"="+num:"Tente outra vez. "+usu+"="+num);

    }
}
