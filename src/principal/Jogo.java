package principal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Jogo extends Canvas{
    
    private BufferStrategy strategy; //permite desenhar antes de se colocar as imagens na tela
    
    public Jogo(){
        //cria a janela que vai rodar o jogo
        JFrame janela = new JFrame("Cap. Ketchup");
        //cria uma area para se desenhar o jogo na janela e defini a resolução do jogo
        JPanel painel = (JPanel) janela.getContentPane();
        painel.setPreferredSize(new Dimension(800, 600));
        painel.setLayout(null);
        
        //cria o tamanho do canvas e coloca ele na janela
        setBounds(0,0,800,600);
        painel.add(this);
        
        //desativa o repaint automatico do AWT
        setIgnoreRepaint(true);
        
        //torna a janela visivel
        janela.pack();
        janela.setResizable(false);//não permite que a janela seja aumentada ou diminuida
        janela.setVisible(true);
        
        //cria um listener que quando o botão de fechar a janela e criada para todaa
        //operção do jogo
        janela.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        /*
            Cria um listener que espera por um imput do teclado
            para que esse seje lido e porcessado pelo
        */
        addKeyListener(new keyInputHandler());
    }
    
    public void gameLoop(){
        Graphics2D graficos = (Graphics2D) strategy.getDrawGraphics();
        graficos.setColor(Color.BLACK);   
    }
    
    public static void main(String [] args){
        Jogo j = new Jogo();
        j.gameLoop();
        /*
            Cria o "jogo" e começa ele
        */
    }

    private static class keyInputHandler extends KeyAdapter{
        /*
            Gaurda os codigos das teclas para sereme usadas
            posteriormente no codigo
        */
        char A = KeyEvent.VK_A;
        char D = KeyEvent.VK_D;
        
        
    }
    
}
