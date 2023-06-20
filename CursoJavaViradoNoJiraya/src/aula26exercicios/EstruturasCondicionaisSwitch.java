package aula26exercicios;

import java.util.Scanner;

public class EstruturasCondicionaisSwitch {
    /*
     * Utilizando o switch:
     * Dado um valor de 1 a 7, imprima se é dia útil ou final de semana
     * Considerando 1 como domingo
     */
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
        
        byte dia;

        System.out.println("Dia: ");
        dia = s.nextByte();

        switch(dia){
            case 1,7:
            System.out.println("Final de semana");
            break;
            case 2,3,4,5,6:
            System.out.println("Dia de semana");
            break;
            default:
            System.out.println("Insira um número válido");
        }

        }
        
    }
}