import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        final int SQUARE_NB = 40;
        final Color SQUARE_COLOR = Color.BLUE;

        final int CIRCLE_NB = 40;
        final Color CIRCLE_COLOR = Color.RED;

        Random random = new Random();

        // Fetch the frameSingleton
        FrameSingleton frame = FrameSingleton.getInstance();
        frame.setTitle("Bouncers");


        // Create all shqpes (square and circle)
        ArrayList<BouncableShape> bouncableShapes = new ArrayList<>(SQUARE_NB + CIRCLE_NB);
        for (int i = 0; i < SQUARE_NB; ++i) {
            bouncableShapes.add(new Square());
        }
        for (int i = 0; i < CIRCLE_NB; ++i) {
            bouncableShapes.add(new Circle());
        }



        Timer timer = new Timer();
        // Set up the repeated task that will update the subject states (seconds)
        TimerTask repeatedTask = new TimerTask() {
            public void run() {

                // Refresh the image component to be able to display bouncableShapes without trace
                Graphics2D g2d = FrameSingleton.getInstance().getGraphics();
                g2d.setColor(Color.WHITE);
                g2d.fillRect(0, 0, FrameSingleton.getInstance().getWidth(), FrameSingleton.getInstance().getHeight());

                // Draw all bouncableShapes
                for(BouncableShape shape : bouncableShapes){
                    shape.move();
                    shape.detectCollisions();
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

}
