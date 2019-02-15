package windoweventex;
import java.awt.*;
import java.awt.event.*;

    class MyFrame extends Frame
    {
        MyFrame()
        {
            this.setVisible(true);
            this.setSize(500,500);
            this.setTitle("window event example");
            this.setBackground(Color.yellow);
            
            this.addWindowListener(new WindowAdapter()
            {
                public void WindowClosing(WindowEvent we)
                {
                    System.out.println("closing");
                    System.exit(0);
                }
            });
            
            
            
        }
        
    }
public class WindowEventEx{

   
    public static void main(String[] args)
    {
        MyFrame f;
        f = new MyFrame();
        
    }
}
        
             
            