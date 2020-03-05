import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        ArrayList<Square> squares = new ArrayList<>();
        squares.add(new Square(10,10));
        squares.add(new Square(20,20));
        squares.add(new Square(30,30));

        FrameSingleton frame = FrameSingleton.getInstance();


        Timer timer = new Timer();
        // Set up the repeated task that will update the subject states (seconds)
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                Graphics2D g = frame.getGraphics();
                for(Square s : squares){
                    s.draw(g);
                }
                frame.repaint();
            }
        };

        long delay  = 0;
        long period = 10;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);

        /*
        while(true){
            Graphics2D g = frame.getGraphics();
            for(Square s : squares){
                s.draw(g);
            }
            //frame.repaint();
        }
         */

    }
}
