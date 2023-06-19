import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        String nome;
        int idade,born;
        Scanner teclado = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        int ano = calendar.get(Calendar.YEAR);
       

        System.out.print("Nome do aluno: ");
        nome = teclado.nextLine();
        System.out.println("Em qual ano você nasceu? ");
        born = teclado.nextInt();
        idade = ano-born;
        System.out.println("Olá "+nome+" você tem "+idade+" anos!!!");
        
    }
}
