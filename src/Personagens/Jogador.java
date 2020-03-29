/*
 Classe do jogador
*/
package Personagens;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Jogador extends Personagem{
    private final int xCrop;
    private final int yCrop;
    
    public Jogador(){
        super("imagens//Cap_Ketchup_SpriteSheet.png", "Jogador", 4, 2);
        this.xCrop = 35;
        this.yCrop = 44;
    }

    public int getLargura(){
        return this.xCrop;
    }
    public int getAltura(){
        return this.yCrop;
    }
    
    @Override
    public void morreu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sprite() {
        BufferedImage sprite = null;
        File arquivo = null;
        //tentar ler a imagem usada como sprite shit
        try{
            arquivo = new File(super.getSpriteSheet());
            sprite = new BufferedImage(this.xCrop, this.yCrop, BufferedImage.TYPE_INT_ARGB);
            sprite = ImageIO.read(arquivo);
        }catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
    
}
