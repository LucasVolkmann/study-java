package func;

import java.util.Random;

import entities.Lutador;

public class Battle {
    
    public static boolean battleValidation(int i,Lutador l1,Lutador l2){

        Random r = new Random();
        int rand;

        switch(i){
            case 1:
                rand = r.nextInt(l1.getLife()+l2.getLife());
                if(l1.getLife()>=rand) return true;
            break;
            case 2:
                rand = r.nextInt(l1.getAtaque()+l2.getAtaque());
                if(l1.getAtaque()>=rand) return true;
            break;
            case 3:
                rand = r.nextInt(l1.getDefesa()+l2.getDefesa());
                if(l1.getDefesa()>=rand) return true;
            break;
        }
        return false;
    }

}
