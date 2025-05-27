package co.edu.uniandes.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")

public class PanelLienzo extends JPanel {
	public void paint(Graphics g) {
		super.paint(g); 
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D.Double rectangle= new Rectangle2D.Double(0,0,700,700);
		g2d.setColor(Color.GRAY); 
		g2d.draw(rectangle);
		g2d.fill(rectangle);
		
		Ellipse2D.Double elipse= new Ellipse2D.Double(350,30,100,100);
		g2d.setColor(Color.BLACK); 
		g2d.draw(elipse);
		g2d.fill(elipse);
		
		Rectangle2D.Double rectangle1= new Rectangle2D.Double(390,130,20,40);
		g2d.setColor(Color.BLACK); 
		g2d.draw(rectangle1);
		g2d.fill(rectangle1);
		
		
		RoundRectangle2D.Double rounrect= new RoundRectangle2D.Double(320,170,25,180,20,20);
		g2d.setColor(Color.BLACK); 
		g2d.draw(rounrect);
		g2d.fill(rounrect);
		
		
		RoundRectangle2D.Double rounrectt= new RoundRectangle2D.Double(455,170,25,180,20,20);
		g2d.setColor(Color.BLACK); 
		g2d.draw(rounrectt);
		g2d.fill(rounrectt);
		
		//ESTE ES EL QUE TENGO QUE ACORDARME 
		
		Rectangle2D.Double rectanglee= new Rectangle2D.Double(335,170,130,40);
		g2d.setColor(Color.BLACK); 
		g2d.draw(rectanglee);
		g2d.fill(rectanglee);
		
		RoundRectangle2D.Double rounrecttt= new RoundRectangle2D.Double(345,200,15,40,20,20);
		g2d.setColor(Color.GRAY); 
		g2d.draw(rounrecttt);
		g2d.fill(rounrecttt);

		RoundRectangle2D.Double rounrectttt= new RoundRectangle2D.Double(440,200,15,40,20,20);
		g2d.setColor(Color.GRAY); 
		g2d.draw(rounrectttt);
		g2d.fill(rounrectttt);
		
		Rectangle2D.Double rectangleee= new Rectangle2D.Double(360,170,80,180);
		g2d.setColor(Color.BLACK); 
		g2d.draw(rectangleee);
		g2d.fill(rectangleee);
		
		RoundRectangle2D.Double rounrecttttt= new RoundRectangle2D.Double(360,330,35,180,20,20);
		g2d.setColor(Color.BLACK); 
		g2d.draw(rounrecttttt);
		g2d.fill(rounrecttttt);

		RoundRectangle2D.Double rounrectttttt= new RoundRectangle2D.Double(405,330,35,180,20,20);
		g2d.setColor(Color.BLACK); 
		g2d.draw(rounrectttttt);
		g2d.fill(rounrectttttt);
		

		int[] listax= new int[] {230,250,550,570};
		

		int[] listay= new int[]{550,500,500,550};
		
		Polygon poly= new Polygon(listax,listay,4); 
		g2d.setColor(Color.WHITE); 
		g2d.draw(poly);
		g2d.fill(poly);
		

		g2d.setColor(new Color(212, 175, 55)); 
		Ellipse2D.Double medalla = new Ellipse2D.Double(385, 260, 30, 30);
		g2d.fill(medalla);


		g2d.setColor(Color.RED);
		g2d.drawLine(385, 260, 375, 240); 
		g2d.drawLine(415, 260, 425, 240); 


		g2d.setColor(Color.WHITE);
		Rectangle2D.Double estrellaSimple = new Rectangle2D.Double(395, 270, 10, 10);
		g2d.fill(estrellaSimple);
		
		
		int banderaX = 290;  
		int banderaY = 550;  
		int ancho = 120;
		int altoFranja = 20;

		g.setColor(Color.YELLOW);
		g.fillRect(banderaX, banderaY, ancho, altoFranja);


		g.setColor(Color.BLUE);
		g.fillRect(banderaX, banderaY + altoFranja, ancho, altoFranja);


		g.setColor(Color.RED);
		g.fillRect(banderaX, banderaY + 2 * altoFranja, ancho, altoFranja);

		
 
		// Reto 3 – Generación de estrella curva exacta (como en plano XY, sin coordenadas negativas)
		g.setColor(Color.YELLOW);
		int cx = 150; 
		int cy = 150; 
		int max = 100;

		for (int i = 0; i <= max; i++) {

		    g.drawLine(cx, cy - max + i, cx + i, cy);

		 
		    g.drawLine(cx, cy + max - i, cx + i, cy);

	
		    g.drawLine(cx, cy + max - i, cx - i, cy);

		    
		    g.drawLine(cx, cy - max + i, cx - i, cy);
		}





			
	}


	
	
	 public PanelLienzo() {
	        
	        setSize(700, 700); 
	    }

}
