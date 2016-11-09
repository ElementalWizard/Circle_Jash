import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ColorPanel extends JPanel{

   private Circle c1, c2 , c3 ,c4 , c5 ,c6;

   private Circle selectedCircle;  // Used to track selected shape
   private int x, y;               // Used to track mouse coordinates  
	
   public ColorPanel(Color backColor){
      setBackground(backColor);
      
      
    	  
      c1=new Circle(280,670,25, Color.red);
      c2=new Circle(230,670,25, Color.blue);
      c3=new Circle(180,670,25, Color.yellow);
      c4=new Circle(130,670,25, Color.magenta);
      c5=new Circle(80,670,25, Color.green);
      c6=new Circle(30,670,25, Color.cyan);
     
    
      selectedCircle = null;   
      addMouseListener(new PanelListener());
      addMouseMotionListener(new PanelMotionListener());
   }
	
   
	
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      Font font5 = new Font("Helvetica", Font.BOLD,  20);
		for ( int x =101;x <=550;x+=56) // horizontal lines
			{g.drawLine(0,x,330,x);}
		/*for( int y = 45;y<565;y+=56)// large ovals
			for( int x=0;x<220;x+=56)
				g.drawOval(x,y,56,56);*/
	
		for( int y=45;y<=591;y+=28)// small ovals
			g.drawOval(224,y,28,28);
		for( int y=45;y<=591;y+=28)// small ovals
			g.drawOval(252,y,28,28);
		
		g.drawLine(224,45,224,605);	// vertical line
		
		
		g.setColor(Color.blue);
		g.setFont(font5);
		g.drawString("MasterMind ",70,45);
		g.drawString("Choose a color ",50,620);
      
	

      c1.fill(g);
	  c2.fill(g);
      c3.fill(g);
      c4.fill(g);
      c5.fill(g);
      c6.fill(g);
      
     
		
      
      
   }

   private class PanelListener extends MouseAdapter{

      public void mousePressed(MouseEvent e){
         x = e.getX();
         y = e.getY();
         
         
         
         if (c1.containsPoint(x, y))
            selectedCircle = c1;
         else if (c2.containsPoint(x, y))
            selectedCircle = c2; 
         else if (c3.containsPoint(x, y))
             selectedCircle = c3; 
         else if (c4.containsPoint(x, y))
             selectedCircle = c4; 
         else if (c5.containsPoint(x, y))
             selectedCircle = c5; 
         else if (c6.containsPoint(x, y))
             selectedCircle = c6; 
         else if (c6.containsPoint(x, y))
             selectedCircle = c6; 
         else if (Circle.c7.containsPoint(x, y))
             selectedCircle = Circle.c7; 
         System.out.println(selectedCircle);
         
      }

      public void mouseReleased(MouseEvent e)
      {
         selectedCircle = null;
         
      }        
   }

   private class PanelMotionListener extends MouseMotionAdapter{


	public void mouseDragged(MouseEvent e){
         if (selectedCircle != null){
            // Compute the distance and move the selected circle
            int newX = e.getX();
            int newY = e.getY();
            int dx = newX - x;
            int dy = newY - y;
            selectedCircle.move(dx, dy);
            x = newX;
            y = newY; 
            repaint();
            if(selectedCircle == Circle.c7){
            	 System.out.println("rar");
            }
         }

        
      }
   } 
}
