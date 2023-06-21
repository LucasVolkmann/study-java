package aula30exercicios;

import java.util.Scanner;

public class EstruturasDeRepeticaoBreak {
    
    /*
     Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
     Condição: valorParcela >= 1000

     -> Descobrir todas as maneiras de parcelamentos com parcelas que são maiores que 1000
     */

    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {

            System.out.println("Qual o valor do carro?");
            double valor = s.nextDouble();

            for (int parcela = 1; parcela <= valor; parcela++) {
                double valorPArcela = valor / parcela;
                if(valorPArcela < 1000){
                    break;
                }
                System.out.println(parcela + "X  de R$"+valorPArcela);
            }

        }

    }
}
