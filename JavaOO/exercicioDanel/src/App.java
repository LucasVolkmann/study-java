import comum.Endereco;
import empregado.Chefe;
import empregado.Comissionado;
import empregado.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        

        Endereco e[] = new Endereco[3];
        e[0]= new Endereco("liquido", "de deus", "botafogo", "Marcos", "12", "casa");
        e[1]= new Endereco("SC", "Blumenau", "Agua Verde", "JOhann Ohf", "1445", "Apto312");
        e[2]= new Endereco("Rio grande do leste", "Garcia", "Gaspar", "São Paulo", "8000000", "tem janela");

        Chefe chefe = new Chefe("Daniel Reichert Rangel", e[0],10);

        Funcionario func = new Funcionario("German Cano", e[1], 36, 400000);

        Comissionado comis = new Comissionado("Baiano", e[2], 0.5, 10);

        //Chefe
        System.out.println("################ chefe");
        System.out.println(chefe.calcularSalario());
        System.out.println(chefe.getEndereco().getNumero());
        System.out.println(chefe.getNome());

        //Funcionario
        System.out.println("################# funcionario");
        System.out.println(func.calcularSalario());

        //Comissionado
        System.out.println("################ comissionado");
        System.out.println(comis.calcularSalario());

        System.out.println();
        System.out.println("------------------------------");
        System.out.println(chefe.toString());
        System.out.println("------------------------------");
        System.out.println(func.toString());
        System.out.println("------------------------------");
        System.out.println(comis.toString());
        System.out.println();

    }
}
