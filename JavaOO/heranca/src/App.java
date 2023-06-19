public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Cano");
        p2.setNome("Arias");
        p3.setNome("Ganso");
        p4.setNome("André");

        p1.setSexo("m");
        p4.setSexo("m");

        p3.receberAum(500.00);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
