
package telas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JPanel{
    public Janela(){
        
        JFrame janela = new JFrame("Cap. Ketchup");
        
        janela.setSize(800,600);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);//desabilita maximizar janela
        janela.setVisible(true);
        janela.add(this);
        
        this.setBackground(Color.white);
    }
    
}
