package aula14exercicios;

import java.util.Scanner;

public class TiposPrimitivos {

    /*
     * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
     * 
     * Eu <nome>, morando na rua <endereço>, confirmo que recebi o salário de <salário>, na data <data>
     * 
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String nome, endereco, data;
        int salario;
        
        System.out.println("Insira o nome abaixo:");
        nome = s.nextLine();
        System.out.println("Insira o endereço abaixo:");
        endereco = s.nextLine();
        System.out.println("Insira a data abaixo:");
        data = s.nextLine();
        System.out.println("Insira o salário abaixo:");
        salario = s.nextInt();
        
        System.out.println("Eu "+nome+", morando na rua "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data);

    }
}
