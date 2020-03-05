import javax.swing.*;
import java.awt.*;

public class MyPanel implements Displayer {

    JPanel panel = new JPanel();

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panel.getGraphics();
    }

    @Override
    public void repaint() {
    }

    @Override
    public void setTitle(String s) {

    }
}
