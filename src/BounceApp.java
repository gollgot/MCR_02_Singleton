import java.awt.*;
import java.util.*;

public class BounceApp {

    private LinkedList<Bouncable> bouncers;

    private final int SQUARE_NB = 20;
    private final int CIRCLE_NB = 20;

    private Timer timer;

    // Fetch the frameSingleton
    private FrameSingleton frame;


    public BounceApp() {
        BouncableFactory f1 = new FactoryFill();
        BouncableFactory f2 = new FactoryOutline();

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

    public static void main(String[] args) {

        new BounceApp().loop();

    }

}
