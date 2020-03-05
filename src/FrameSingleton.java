import javax.swing.*;
import java.awt.*;

public class FrameSingleton implements Displayer{

    private static FrameSingleton instance;
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    private JFrame frame = new JFrame();
    private FramePanel panel = new FramePanel();
    private Image image;

    // Private constructor
    private FrameSingleton(){
        frame.setTitle("Bouncers");
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(this.panel);
        frame.setVisible(true);

        this.image = panel.createImage(getWidth(),getHeight());
    }

    public static FrameSingleton getInstance(){
        if(instance == null){
            instance = new FrameSingleton();
        }

        return instance;
    }

    public Image getImage() {
        return image;
    }

    @Override
    public int getWidth() {
        return WIDTH;
    }

    @Override
    public int getHeight() {
        return HEIGHT;
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panel.getGraphics();
    }

    @Override
    public void repaint() {
        panel.repaint();
    }

    @Override
    public void setTitle(String s) {
        frame.setTitle(s);
    }
}
