import javax.swing.*;
import java.awt.*;

/**
 * Create our own Panel class to be able to have the paint override method.
 * This way the operating system will call himself the paint() method ad we'll have a good
 * frame refresh rate.
 */
public class FramePanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(FrameSingleton.getInstance().getImage(), 0, 0, null);
    }
}
