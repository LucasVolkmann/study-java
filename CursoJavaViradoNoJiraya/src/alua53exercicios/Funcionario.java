package alua53exercicios;

public class Funcionario {
    
    String nome;
    int idade;
    double[] salarios;

    public void imprimir(){

        if(salarios == null){return;}

        String impsalarios = "Salários: ";

        for (double i : this.salarios) {
            impsalarios += i+" ";
        }
        
        System.out.println("Nome: "+ nome +"\nIdade: "+idade+"\nSalários: "+impsalarios);
    }

    public void mediaSal(){

        if(salarios == null){return;}

        double med=0;

        for (double i : salarios) {
            med+=i;
        }

        med /= salarios.length;

        System.out.println("A média é "+med);
    }

}
