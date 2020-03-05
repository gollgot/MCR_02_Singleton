import javax.swing.*;
import java.awt.*;

public class FramePanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(FrameSingleton.getInstance().getImage(), 0, 0, null);
    }
}
