import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador(
        "Pretty Boy", 
        "França", 
        31, 
        1.75f, 
        68.9f, 
        11, 
        2, 
        1
        );
        l[1] = new Lutador(
        "Putsscript", 
        "Brasil", 
        29, 
        1.68f, 
        57.8f, 
        14, 
        2, 
        3
        );
        l[2] = new Lutador(
        "Snapshadow", 
        "EUA", 
        35, 
        1.65f, 
        80.9f, 
        12, 
        2, 
        1
        );
        l[3] = new Lutador(
        "Dead Code", 
        "Austrália", 
        28, 
        1.93f, 
        81.6f, 
        13, 
        0, 
        2
        );
        l[4] = new Lutador(
        "UFOCobol", 
        "Brasil", 
        37, 
        1.7f, 
        119.3f, 
        5, 
        4, 
        3
        );
        l[5] = new Lutador(
        "Nerdaart", 
        "EUA", 
        30, 
        1.81f, 
        105.7f, 
        12, 
        2, 
        4
        );

        Luta lutaUM = new Luta();

        int dor = 1,ado=1,i=1;
        do{
            dor = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                            "<html>"+
                                                            "---------- ESCOLHA O DESAFIADOR ----------"+
                                                            "</html>"));

            ado = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                            "<html>"+
                                                            "---------- ESCOLHA O DESAFIADO  ----------"+
                                                            "</html>"));

            lutaUM.marcarLuta(l[dor], l[ado]);
            lutaUM.lutar();
            l[dor].status();
            l[ado].status();                                        
                                                            
            try{
                i = Integer.parseInt(JOptionPane.showInputDialog(null, "Para sair digite 0"));
            }catch(NumberFormatException e){
                i=1;
            }

        }while (i!=0);
    }
}
