/*
    Classe base para a criação de inimigos e o jogador
*/
package Personagens;

import java.awt.Image;
import telas.*;

public abstract class Personagem {
    private final String spriteSheet;
    private final String nome;
    private int vida;
    private int ataque;
    
    //construtor
    public Personagem(String spriteSheet, String nome, int vida, int ataque){
        this.spriteSheet = spriteSheet;
        this.ataque = ataque;
        this.nome = nome;
        this.vida = vida;
    }
    
    //gets
    public String getNome(){
        return this.nome;
    }
    public int getVida(){
        return this.vida;
    }
    public int getAtaque(){
        return this.ataque;
    }
    public String getSpriteSheet(){
        return this.spriteSheet;
    }
    
    //atualiza vida
    public void atualizaVida(int dano){
        if(this.vida - dano <= 0){
            morreu();
        }else{
            this.vida -= dano;
        }
    }
    
    //funsções
    public abstract void morreu(); //instancia a função para ser usado depois
    public abstract void mover(); //instancia a função para ser usado depois
    public abstract void atacar(); //instancia a função para ser usado depois
    public abstract void sprite(); //instancia a função para ser usado depois
}
