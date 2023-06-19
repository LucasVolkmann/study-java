import java.util.Random;

import javax.swing.JOptionPane;

import entities.Lutador;
import func.Battle;

public class App {

    public static void treinar(Lutador l,int i){

        switch(i){
            case 1:
            l.treinarVida();
            break;
            case 2:
            l.treinarAtaque();
            break;
            case 3:
            l.treinarDefesa();
            break;
        }

    }

    public static void main(String[] args) throws Exception {
        
        Random r = new Random();
        Lutador l[] = new Lutador[2];
        l[0] = new Lutador("PH Ganso",0);
        int confirm=5,confirmbt=0,consTreino=0,confirmRound=0;
        int winstreak=0;
        

        do{

            try{

                confirm = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>"+
                                                                            l[0].toString()+
                                                                            "<br>TREINOS DISPONÍVEIS: ["+(3-consTreino)+"]"+
                                                                            "<br><br>O que você deseja fazer?<hr>"+
                                                                            "Digite: "+
                                                                            "<br>[1] -> para treinar vida"+
                                                                            "<br>[2] -> para treinar ataque"+
                                                                            "<br>[3] -> para treinar defesa"+
                                                                            "<br>[4] -> para a próxima fase"+
                                                                            "<br>[0] -> para sair"+
                                                                            "</html>"));

            }catch(NumberFormatException e){
                
                JOptionPane.showMessageDialog(null, "Insira um número de 0 a 4");
                confirm = -1;

            }

            if(confirm>=1&&confirm<=3&&consTreino<=2){

                App.treinar(l[0], confirm);
                consTreino++;

            }else if(confirm==4){

                l[1] = new Lutador("OPONENTE DE NÍVEL "+winstreak, winstreak);
                
                do{

                try{

                    confirmbt = Integer.parseInt(JOptionPane.showInputDialog(null,  "<html>"+
                                                                                                    l[0].toString()+
                                                                                                    "<br><hr><h3 style='background-color: white' align='center'>V E R S U S</h3><hr><br>"+
                                                                                                    l[1].toString()+
                                                                                                    "Qual atributo você escolhe para esse round?"+
                                                                                                    "<br>[1] - life"+
                                                                                                    "<br>[2] - defesa"+
                                                                                                    "<br>[3] - ataque"+
                                                                                                    "<br></html>"));

                    if(Battle.battleValidation(confirmbt,l[0],l[1])){
                        JOptionPane.showMessageDialog(null,"Parabéns, você venceu esse round!!!");
                        confirmRound++;
                    }else{
                        JOptionPane.showMessageDialog(null,"Você perdeu o round.");

                    }
                                                                                    

                }catch(NumberFormatException e){

                    JOptionPane.showMessageDialog(null, "Insira um número de 1 a 3");
    
                }

                }while(confirmbt<1&&confirmbt>3);

                
                consTreino=0;

            }else if(consTreino>2&&confirm>0&&confirm<4){

                JOptionPane.showMessageDialog(null, "Os treinos disponíveis acabaram!!");

            }

        }while(confirm!=0);

    }
}
