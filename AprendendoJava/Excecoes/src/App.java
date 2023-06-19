import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        String frase = null;
        String novaFrase = null;

        try{
        novaFrase=frase.toUpperCase();
        }catch(NullPointerException e){ //CAPTURA DA POSSÍVEL exceção.

            //TRATAMENTO DA exceção
            System.out.println("O frase inicial está nula, para solucional tal o problema, foi lhe atribuito um valor default.");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();

        }

        System.out.println("Frase Antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);

        /* 
        frase = JOptionPane.showInputDialog(null, "");
        novaFrase = frase.toUpperCase();
        JOptionPane.showMessageDialog(null, "<html>"+frase+"<hr>"+novaFrase+"</html");
        */

    }
}
