// Amadou Bah
// CSC1302 Homework: Smiley
// 11/10/2017
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Smile extends JPanel{

   public static void main(String[] args){
      
      JFrame frame = new JFrame("Smiley Face");
      frame.setSize(300, 300);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Smile panel = new Smile(); 
      frame.add(panel);
      
   }
   public void paintComponent(Graphics g){
      //Overall Background
      g.setColor(Color.RED);
      g.fillRect(0,0,10000,10000);
      
      //Head
      g.setColor(Color.YELLOW);
      g.fillOval(100, 100, 100,100);
      
      //Glasses
      g.setColor(Color.BLACK);
      g.fillOval(108, 118, 40, 40);
      
      g.setColor(Color.BLACK);
      g.fillOval(152, 118, 40, 40);
      
      g.setColor(Color.BLACK);
      g.fillRect(148, 138, 8, 4);
      //Skin
      g.setColor(Color.YELLOW);
      g.fillOval(113, 123, 30, 30);
      
      g.setColor(Color.YELLOW);
      g.fillOval(157, 123, 30, 30);
      
      //Eyes
      g.setColor(Color.BLUE);
      g.fillOval(120, 130, 20, 20);
      
      g.setColor(Color.BLUE);
      g.fillOval(160, 130, 20, 20);
      
      //Mouth
      g.setColor(Color.RED);
      g.drawArc(130, 160, 40, 20,-10,-160);

      //Neck
      g.setColor(Color.YELLOW);
      g.fillRect(140, 200, 20,10); 
      
      
      //Bottom Shirt
      g.setColor(Color.BLACK);
      g.fillRect(130, 220, 40,80);
      
      //Sleaves
      g.setColor(Color.BLACK);
      g.fillRect(180, 220, 20,30);
      
      g.setColor(Color.BLACK);
      g.fillRect(100, 220, 20,30);
      
      int [] x = {120,130,120};
      int [] y = {220,220,250};
      g.setColor(Color.BLACK);
      g.fillPolygon(x, y, 3); 
      
      int [] x1 = {170,180,180};
      int [] y1 = {220,220,250};
      g.setColor(Color.BLACK);
      g.fillPolygon(x1, y1, 3);
      
      //Top Shirt
      g.setColor(Color.BLACK);
      g.fillRect(100, 210, 100,20);
      
      int [] xcut = {100,120,100};
      int [] ycut = {210,210,250};
      g.setColor(Color.RED);
      g.fillPolygon(xcut, ycut, 3);
      
      int [] xcut1 = {180,200,200};
      int [] ycut1 = {210,210,250};
      g.setColor(Color.RED);
      g.fillPolygon(xcut1, ycut1, 3);
      
      //Pants
      g.setColor(Color.BLUE);
      g.fillRect(130, 300, 40,150);
      
      int [] x2 = {145,150,155};
      int [] y2 = {450,310,450};
      g.setColor(Color.RED);
      g.fillPolygon(x2, y2, 3);
      
      //Shoes
      g.setColor(Color.BLACK);
      g.fillOval(130, 445, 15,10);
      
      g.setColor(Color.BLACK);
      g.fillOval(155, 445, 14,10);
      
      //Left Arm
      g.setColor(Color.YELLOW);
      g.fillRect(80, 250, 50,140);
      
      int [] x3 = {80,100,80};
      int [] y3 = {250,250,290};
      g.setColor(Color.RED);
      g.fillPolygon(x3, y3, 3); 
      
      int [] x4 = {130,100,130};
      int [] y4 = {220,290,290};
      g.setColor(Color.RED);
      g.fillPolygon(x4, y4, 3);
      
      int [] x5 = {100,130,130};
      int [] y5 = {290,290,370};
      g.setColor(Color.RED);
      g.fillPolygon(x5, y5, 3); 
      
      int [] x6 = {80,80,130};
      int [] y6 = {290,390,390};
      g.setColor(Color.RED);
      g.fillPolygon(x6, y6, 3);
      
      //Right Arm
      g.setColor(Color.YELLOW);
      g.fillRect(170, 250, 50,140);
      
      int [] x7 = {220,200,220};
      int [] y7 = {250,250,290};
      g.setColor(Color.RED);
      g.fillPolygon(x7, y7, 3); 
      
      int [] x8 = {170,170,200};
      int [] y8 = {220,290,290};
      g.setColor(Color.RED);
      g.fillPolygon(x8, y8, 3);
      
      int [] x9 = {170,200,170};
      int [] y9 = {290,290,370};
      g.setColor(Color.RED);
      g.fillPolygon(x9, y9, 3); 
      
      int [] x10 = {220,220,170};
      int [] y10 = {290,390,390};
      g.setColor(Color.RED);
      g.fillPolygon(x10, y10, 3);
      
      //Text
      g.setColor(Color.BLACK);
      g.drawString( "SLENDER MAN",100,50);
      
   }
}