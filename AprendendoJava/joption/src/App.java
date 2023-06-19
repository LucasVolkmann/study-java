
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int par=0,imp=0,cem=0,tot=0,num=0,med,sum=0;
        
        do{

            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: \n(0 interrompe a coleta de dados)"));
            if(num!=0){
                if(num%2==0){par++;}else{imp++;}
                if(num>100){cem++;}
                sum+=num;tot++;
            }
            
        } while(num!=0);
        
        med=sum/tot;
        
        JOptionPane.showMessageDialog(null, 
        "<html>RESULTADO: <hr>"+
        "Total de números:"+tot+
        "<br>Total de pares:"+par+
        "<br>Total de ímpares:"+imp+
        "<br>Acima de 100:"+cem+
        "<br>Média dos valores:"+med+"</html>");
    }
}
