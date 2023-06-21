package alua53exercicios;

public class OOMetodos {
    /*
     * Crie uma classe Funcionário com os seguintes atributos
     *  
     * nome
     * idade
     * salario // três salários devem ser guardados
     * 
     * Crie dois métodos
     * 
     * 1. Para imprimir os dados
     * 2. Para tirar a média dos salários e imprimir o resultado
     */
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "Samuel Xavier";
        f.idade = 90;
        f.salarios = new double[]{1000,1200,800};

        f.imprimir();
        System.out.println("------------------");
        f.mediaSal();
    }
}
