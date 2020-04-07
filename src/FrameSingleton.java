import javax.swing.*;
import java.awt.*;

public class FrameSingleton implements Displayer {

    private static FrameSingleton instance;
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    private JFrame frame = new JFrame();

    private FramePanel panel = new FramePanel();
    private Image image;

    /**
     * Private constructor for our singleton.
     * Frame settings
     */
    private FrameSingleton(){
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setContentPane(panel);

        frame.pack();
        frame.setVisible(true);

        this.image = panel.createImage(panel.getWidth(),panel.getHeight());
    }

    /**
     * Fetch a singleton of the FrameSingleton class
     * @return A singleton
     */
    public static FrameSingleton getInstance(){
        if(instance == null){
            instance = new FrameSingleton();
        }

        return instance;
    }

    public Image getImage() {
        return image;
    }

    public JFrame getFrame() {
        return frame;
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
        return (Graphics2D) image.getGraphics();
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
