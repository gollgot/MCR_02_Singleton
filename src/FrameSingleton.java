import javax.swing.*;
import java.awt.*;

public class FrameSingleton implements Displayer{

    private static FrameSingleton instance;
    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    private JPanel panel = new JPanel();
    JFrame frame = new JFrame();

    // Private constructor
    private FrameSingleton(){
        frame.setTitle("Bouncers");
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setContentPane(panel);

        frame.setVisible(true);

        Square s = new Square(10,10);

    }

    public static FrameSingleton getInstance(){
        if(instance == null){
            instance = new FrameSingleton();
        }

        return instance;
    }

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
        panel.repaint();
        frame.repaint();
    }

    @Override
    public void setTitle(String s) {
        frame.setTitle(s);
    }
}
