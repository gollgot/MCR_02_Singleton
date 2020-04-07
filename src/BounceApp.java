import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.Timer;


public class BounceApp implements KeyListener {

    private LinkedList<Bouncable> bouncers;

    private final int SQUARE_NB = 20; // value for each one (fill and outline)
    private final int CIRCLE_NB = 20; // value for each one (fill and outline)

    private Timer timer;
    private FrameSingleton frame;

    private final int SHAPE_NB = 10;

    public BounceApp() {
        this.frame = FrameSingleton.getInstance();

        this.frame.setTitle("Bouncers");

        // Create all shape (square and circle)
        bouncers = new LinkedList<>();
        for (int i = 0; i < SQUARE_NB ; ++i) {
            bouncers.add(FactoryFill.getInstance().createSquare());
            bouncers.add(FactoryFill.getInstance().createCircle());
        }
        for (int i = 0; i < CIRCLE_NB; ++i) {
            bouncers.add(FactoryOutline.getInstance().createSquare());
            bouncers.add(FactoryOutline.getInstance().createCircle());
        }

        timer = new Timer();
    }

    public void loop(){
        // Set up the repeated task that will update the subject states (seconds)
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                // Draw a white rectangle that fit the window to be able to display bouncableShapes without trace
                Graphics2D g2d = FrameSingleton.getInstance().getGraphics();
                g2d.setColor(Color.WHITE);
                g2d.fillRect(0, 0, FrameSingleton.getInstance().getWidth(), FrameSingleton.getInstance().getHeight());

                // Draw all bouncableShapes and move them
                for(Bouncable shape : bouncers){
                    shape.move();
                    shape.draw();
                }

                // Force the frame to repaint with modification
                frame.repaint();
            }
        };

        long delay  = 0;
        long period = 12;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }

    /**
     * Operates action depending on user input (key pressing)
     * Either creates fill/outline shapes, erase all shapes or quit application
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_B || key == KeyEvent.VK_F) { // Spawn shapes
            BouncableFactory factory = e.getKeyCode() == KeyEvent.VK_B ? // Choose correct factory
                    FactoryOutline.getInstance()
                    : FactoryFill.getInstance();

            for (int i = 0; i < SHAPE_NB; ++i) { // Create shapes
                bouncers.add(factory.createSquare());
                bouncers.add(factory.createCircle());
            }
        } else if(key == KeyEvent.VK_E) { // Erase all shapes
            bouncers.clear();
        } else if(key == KeyEvent.VK_Q) { // Quit application
            System.exit(0);
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent) {}

    public static void main(String[] args) {
        new BounceApp().loop();
    }

}
