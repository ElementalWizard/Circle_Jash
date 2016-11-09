import java.awt.*;

import javax.swing.*;

public class Circle extends JPanel{

   private int centerX, centerY, radius;
   private Color color;

   public Circle(int x, int y, int r, Color c){
      centerX = x;
      centerY = y;
      radius = r;
      color = c;
   }
	public static Circle c7;



	
	
	

	public void clear (Graphics g){

		   g.setColor(Color.white);
		   g.drawOval(26, 577, 50, 50);  
		   g.fillOval(26 , 577, 50, 50);
		   repaint();
	}
	 
	public void Extra_circle(Graphics g, boolean temp) {
		
  	  	
		   if (temp == true){
			   int cordX = 26 - 25;
			   int cordY = 577 - 25 ;
			   c7=new Circle(cordX,cordY,25, Color.black);
			   Color oldColor = g.getColor();
			   g.setColor(color);
			   g.drawOval(cordX, cordY, 50, 50);  
			   g.fillOval(cordX , cordY, 50, 50);
			   g.setColor(oldColor);
			 


			 
			   
		   }
		   
		   	  
			   
		   else{
			   
		   }
		  
		 
	}
   public void draw(Graphics g){
	   
      Color oldColor = g.getColor();
      g.setColor(color);
     
      // Translates circle's center to rectangle's origin for drawing.
      g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
      g.setColor(oldColor);
      
      
   }
   boolean temp = false; 
   public void fill(Graphics g){
      Color oldColor = g.getColor();
      g.setColor(color);
      // Translates circle's center to rectangle's origin for drawing.
      g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
      g.setColor(oldColor);
      System.out.println(centerX +"," + centerY);
      
      if (centerX == 26 && centerY == 577 ){
    	  
    	  temp = true; 
    	  
      }
      else{
    	  

      }
      
      Extra_circle(g, temp );
   }

   public boolean containsPoint(int x, int y){
      int xSquared = (x - centerX) * (x - centerX);
      int ySquared = (y - centerY) * (y - centerY);
      int radiusSquared = radius * radius;
      return xSquared + ySquared - radiusSquared <= 0;
   }

   public void move(int xAmount, int yAmount){
      centerX = centerX + xAmount;
      centerY = centerY + yAmount;
   }
/*public static Circle getC7() {
	return c7;
}
public void setC7(Circle c7) {
	this.c7 = c7;
}*/
}

