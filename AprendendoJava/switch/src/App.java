import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner t = new Scanner(System.in);
        
        System.out.print("Quantos Títulos: ");
        int p = t.nextInt();
        String den;
        System.out.print("O time é ");
        switch(p){

            case 1:
            den = "Campeão";
            break;
            case 2:
            den = "Bicampeão";
            break;
            case 3:
            den = "Tricampeão";
            break;
            case 4:
            den = "Tetracampeão";
            break;
            case 5:
            den = "Pentacampeão";
            break;
            case 6:
            den = "Hexacampeão";
            break;
            case 7:
            den = "Heptacampeão";
            break;
            case 8:
            den = "Octacampeão";
            break;
            default:
            den = "Multicampeão";

        }

        System.out.println(den);

    }
}
