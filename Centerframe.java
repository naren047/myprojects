import javax.swing.*;
import java.awt.*;

public class Centerframe {
    public static void center(JFrame frame) {
 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
 
        int w = frame.getSize().width;
        int h = frame.getSize().height;
 
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
 
        frame.setLocation(x, y);
 
    }
}
