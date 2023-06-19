import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner t = new Scanner(System.in);

        /*  Fatorial de um número utilizando o "while".

        System.out.print("Escolha um número para fatorar: ");
        int f = t.nextInt();
        int r = 1;
        System.out.print(f);
        while(f>1){
            r *= f;
            f--;
            System.out.print(" x "+f);
        }    
        System.out.print(" = "+r);
        */  

        //-----------------------------------------------------------
        // Fatorial utilizando o "do while".
        
        /*
        String resp;
        do{
        
            System.out.print("Escolha um número: ");
            int num = t.nextInt();
            int res = 1;
            int fat = num;

            if(num>1){
                do{
                    res *= num;
                    num--;
                } while (num>1);
            }    

            System.out.println("O fatorial de "+fat+" é: "+res);

            System.out.print("Deseja continuar? [s/n]");
            resp = t.next();
        } while(resp.equals("s"));
        */

        //-----------------------------------------------------------
        // FAtorial utilizando o "for".

        //int res=1, num = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:"));
        //String tim = "";
        //for(int i=num;i>1;i--){
        //    tim += i+" x ";
        //    res *= i;
        //}
        //tim += "1";
        //JOptionPane.showMessageDialog(null, "<html>O valor de "+num+"!<hr>"+tim+
        //                                                   " = "+res+
        //                                                   "</html>");

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:"));
        JOptionPane.showMessageDialog(null, ClasseFatorial.conta(num));
        
    }
}
