import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

    Fatorial f = new Fatorial();

    int i = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor:"));

    f.setValor(i);

    JOptionPane.showMessageDialog(null, f.getFormula()+" = "+f.getFatorial());

    }
}
