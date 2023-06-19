import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner t = new Scanner(System.in);

        System.out.print("Digite 3 lados de um triângulo: ");
        int l1 = t.nextInt();
        System.out.print("Digite 3 lados de um triângulo: ");
        int l2 = t.nextInt();
        System.out.print("Digite 3 lados de um triângulo: ");
        int l3 = t.nextInt();

        if(l1<l2+l3 || l2<l3+l1 || l3<l1+l2){
            System.out.println("Não é um triângulo!");
        }else if(l1==l2 && l1==l3){
            System.out.println("É um triângulo Equilátero.");
        }else if(l1==l2^l1==l3^l2==l3){
            System.out.println("É um triângulo Isóceles.");
        }else{
            System.out.println("É um trinângulo Escaleno.");
        }


    }
}
