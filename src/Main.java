import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        final int SQUARE_WIDTH = 10;
        final int SQUARE_HEIGHT = 10;
        final Color SQUARE_COLOR = Color.BLUE;

        final int CIRCLE_WIDTH = 10;
        final int CIRCLE_HEIGHT = 10;
        final Color CIRCLE_COLOR = Color.RED;

        // Create all squares
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(10,30, SQUARE_WIDTH, SQUARE_HEIGHT, SQUARE_COLOR));
        shapes.add(new Square(20,10, SQUARE_WIDTH, SQUARE_HEIGHT, SQUARE_COLOR));
        shapes.add(new Square(40,20, SQUARE_WIDTH, SQUARE_HEIGHT, SQUARE_COLOR));
        shapes.add(new Circle(100,200, CIRCLE_WIDTH, CIRCLE_HEIGHT, CIRCLE_COLOR));
        shapes.add(new Circle(90,180, CIRCLE_WIDTH, CIRCLE_HEIGHT, CIRCLE_COLOR));
        shapes.add(new Circle(80,160, CIRCLE_WIDTH, CIRCLE_HEIGHT, CIRCLE_COLOR));

        // Fetch the frameSingleton
        FrameSingleton frame = FrameSingleton.getInstance();


        Timer timer = new Timer();
        // Set up the repeated task that will update the subject states (seconds)
        TimerTask repeatedTask = new TimerTask() {
            public void run() {

                // Refresh the image component to be able to display shapes without trace
                Graphics2D g2d = FrameSingleton.getInstance().getGraphics();
                g2d.setColor(Color.WHITE);
                g2d.fillRect(0, 0, FrameSingleton.getInstance().getWidth(), FrameSingleton.getInstance().getHeight());

                // Draw all squares
                for(Shape shape : shapes){
                    shape.updatePosition();
                    shape.detectCollisions();
                    shape.draw(g2d);
                }

                // Force the frame to repaint with modification
                frame.repaint();
            }
        };

        long delay  = 0;
        long period = 10;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);

    }
}
