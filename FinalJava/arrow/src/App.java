import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Runnable r = () -> System.out.println("Thread com função lambda!");
        new Thread(r).start();

        System.out.println("Imprime todos os elementos da lista!");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(n -> System.out.println(n));

        //--------------------------------------------------------

        List<Pessoa> listPessoas = Arrays.asList(new Pessoa("Eduardo", 29),
        new Pessoa("Luiz", 32), new Pessoa("Bruna", 26));
        System.out.println("Ordenando pessoas pelo nome:");
        Collections.sort(listPessoas, (Pessoa pessoa1, Pessoa pessoa2)
        -> pessoa1.getNome().compareTo(pessoa2.getNome()));
        listPessoas.forEach(p -> System.out.println(p.getNome()));

        }
}
