import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Novo objeto para a entrada de dados no sistema
        Scanner t = new Scanner(System.in);
        
        //Recebendo o numerador do usuário
        System.out.print("Numerador: ");
        float num = t.nextFloat();

        //Recebendo o denominador do usuário
        System.out.print("Denominador: ");
        float den = t.nextFloat();
        
        //Realizando as operações aritméticas
        float div = num/den;
        float res = num%den;
        
        //Saída de dados do sistema, indicando o resultado da divisão e o resto
        System.out.println("Divisão: "+div+", Resto: "+res+".");

        
    }
}

