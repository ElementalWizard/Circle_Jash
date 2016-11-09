import javax.swing.*;
import java.awt.*;

public class GUIWindow{

   public static void main(String[] args){
      JFrame theGUI = new JFrame();
      theGUI.setTitle("Andrea J");
      theGUI.setSize(320, 720);
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ColorPanel panel = new ColorPanel(Color.white);
      Container pane = theGUI.getContentPane();
      pane.setLayout(new GridLayout(1, 1));
      pane.add(panel);
      theGUI.setVisible(true);
   }
}
