package co.edu.uniandes.graphics.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
@SuppressWarnings("serial")
public class InterfazPrincipal extends JFrame {
	
	private PanelLienzo panelLienzo;
	
	
	public InterfazPrincipal() {

        setSize(new Dimension(700, 700)); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        
        panelLienzo = new PanelLienzo();
        add(panelLienzo, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfazPrincipal(); 
    }
}
