package aula23exercicios;

import java.util.Scanner;

public class EstruturasCondicionais {
    /* 
     *  Definir uma taxa de acordo com o salário
     *  Pegando como base a tabela de imposto de renda
     * 
     *  TABELA DE IRRF (04/2015 - 04/2023)
     *  até 1903 = 00
     *  de 1903 até 2826 = 7,5
     *  de 2826 até 3752 = 15 
     *  de 3751 até 4664 = 22,5
     *  a partir de 4664 = 27,5
    */
    public static void main(String[] args) {
     
        try (Scanner s = new Scanner(System.in)) {
            int salario;

            System.out.println("Qual seu salário?");
            salario = s.nextInt();
            
            if(salario < 1903){
                System.out.println("Isento");
            }else if(salario < 2826){
                System.out.println("Taxa: 7,5% Dedução: "+salario*0.075);
            }else if(salario < 3752){
                System.out.println("Taxa de 15% Dedução: "+salario*0.15);
            }else if(salario < 4664){
                System.out.println("Taxa: 22,5% Dedução: "+salario*0.225);
            }else{
                System.out.println("Taxa: 27,5% Dedução: "+salario*0.275);
            }
        }



    }
}
