import java.util.Arrays;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int principal[] = new int[10];
        int pos=0,val=0;

        String manter = "";
        String tabbasica = "";

        do{

            tabbasica += "Dados do vetor:<hr>";
            for(int valor=0;valor<principal.length;valor++){
                tabbasica += "["+valor+"] -> "+principal[valor]+"<br>";
            }
            tabbasica +="<hr>";

            manter = JOptionPane.showInputDialog(null, "<html>"+
                                                    tabbasica+
                                                    "O que você deseja fazer?<br>"+
                                                    "Adicionar ou alterar? (digite: a)<br>"+
                                                    "Remover? (digite: r)<br>"+
                                                    "Ordenar? (digite: o)<br>"+
                                                    "Sair? (digite: s)"+
                                                    "</html>");

                if(manter.equals("a")){

                    pos = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>"+
                                                tabbasica+
                                                "Em qual posição do vetor você deseja agir?"+
                                                "</html>"));
                    val = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>"+
                    tabbasica+
                    "Qual valor você deseja inserir?"+
                    "</html>"));
                    principal[pos]=val;
                    tabbasica="";
                }
                if(manter.equals("r")){

                    pos = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>"+
                                                                        tabbasica+
                                                                        "Em qual espaço você quer que o valor seja removido?"+
                                                                        "</html>"));
                    principal[pos]=0;
                    tabbasica="";

                }
                if(manter.equals("o")){Arrays.sort(principal);tabbasica="";}

        }while(!manter.equals("s"));


    }
}
