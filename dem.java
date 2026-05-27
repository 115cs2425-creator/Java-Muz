import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class dem extends JPanel{
    @Override
    public void  paint(Graphics g){
        g.drawString("Welcome to applet",150,150);
         }
         public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.add(new dem());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
      }