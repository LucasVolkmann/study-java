package entities;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lutador {
        
    private String nome;
    private int life;
    private int defesa;
    private int ataque;
    
    public void treinarVida(){
        this.life +=100;
    }
    
    public void treinarDefesa(){
        if(defesa<100){
        this.defesa +=5;
        }else{
            JOptionPane.showMessageDialog(null, "A sua defesa já está no máximo!!");
        }
    }

    public void treinarAtaque(){
        if(ataque<100){
        this.ataque +=5;
        }else{
            JOptionPane.showMessageDialog(null, "O seu ataque já está no máximo!!");
        }
    }

    //Construtor
    public Lutador(String nome,int nivel) {

        Random r = new Random();
        r.nextInt(10);

        if(nivel==0){
            this.nome = nome;
            this.life = 100 + (r.nextInt(101)*5);
            this.defesa = (r.nextInt(11)*5);
            this.ataque = (r.nextInt(11)*5);
        }else {
            this.nome = nome;
            this.life = 100 + (r.nextInt(101)*5)+(nivel*5);
            this.defesa = (r.nextInt(11)*5)+(nivel*5);
            this.ataque = (r.nextInt(11)*5)+(nivel*5);
        }
    }
    
    //Métodos acessores e modificadores
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "<hr><h3 align='center'>"+this.nome.toUpperCase()+"</h3><p style='background-color: green;color:white' align = 'center'>life=" + life + "</p><p style='background-color: blue;color:white' align = 'center'>defesa=" + defesa + "</p><p style='background-color: red;color:white' align = 'center'>ataque=" + ataque + "</p><hr>";
    }

    

}
