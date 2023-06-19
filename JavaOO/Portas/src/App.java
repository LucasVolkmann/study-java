import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

public class App {

    public static int texto(String p1,String p2,String p3,String tipo){
        
        return Integer.parseInt(JOptionPane.showInputDialog(null,"<html>"
                                                                                +"Porta 1: "+p1
                                                                                +"<br><br>Porta 2: "+p2
                                                                                +"<br><br>Porta 3: "+p3
                                                                                +"<hr>"
                                                                                +tipo
                                                                                +"</html>"));

    }
    public static void main(String[] args) throws Exception {
        
        DecimalFormat d = new DecimalFormat(".00");
        Random r = new Random();
        int confirm, totJogadas=0,totVencidas=0, escolha=0, premio;
        String p1,p2,p3;
        double razao;


        do{
            premio = r.nextInt(3);
            p1="FECHADA";
            p2="FECHADA";
            p3="FECHADA";
            try{

                escolha = texto(p1,p2,p3,"ESCOLHA UMA PORTA: ")-1;

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error");
            }

            if(escolha>=0&&escolha<=2){

                switch(escolha){

                    case 0:
                        p1="ESCOLHIDA";
                        if(premio==1){
                            p3="BODE";
                        }else{
                            p2="BODE";
                        }
                    break;
                    case 1:
                        p2="ESCOLHIDA";
                        if(premio==2){
                            p1="BODE";
                        }else{
                            p3="BODE";
                        }
                    break;
                    case 2:
                        p3="ESCOLHIDA";
                        if(premio==0){
                            p2="BODE";
                        }else{
                            p1="BODE";
                        }

                    break;

                }

                try{
                    escolha = texto(p1,p2,p3, "Quer manter a sua escolha?")-1;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Error");
                }

                if(escolha==premio){
                    JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ GANHOU!!!");
                    totVencidas++;
                    totJogadas++;
                }else{
                    JOptionPane.showMessageDialog(null, "VOCÊ PERDEU! :(");
                    totJogadas++;
                }

            }else {
                JOptionPane.showMessageDialog(null, "Escolha entre 1, 2 e 3. Quaisquer outros números não serão aceitos.");
            }
            razao=totVencidas/totJogadas;
            System.out.println(razao);
            confirm = JOptionPane.showConfirmDialog(null, "<html>"+
                                                                        "Número de jogadas: "+totJogadas+
                                                                        "<br><br>Vezes vencidas: "+totVencidas+
                                                                        "<br><br>Razão entre vitórias e total: "+d.format(razao)+
                                                                        "<br><hr>"+
                                                                        "Quer continuar?"+
                                                                        "</html>", null, 0);
        }while(confirm==0);

    }
}
