/*
 * File: Bouncer.BounceApp.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer;

import Bouncer.Displayer.FrameSingleton;
import Bouncer.Factory.BouncableFactory;
import Bouncer.Factory.FactoryFill;
import Bouncer.Factory.FactoryOutline;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.Timer;


public class BounceApp implements KeyListener {

    private LinkedList<Bouncable> bouncers;
    private Timer timer;
    private FrameSingleton frame;

    private final int SHAPE_NB = 10;
    private final int FRAME_RATE = 12;

    /**
     * Empty constructor
     */
    public BounceApp() {
        this.frame = FrameSingleton.getInstance();
        this.timer = new Timer();
        this.bouncers = new LinkedList<>();
        this.frame.setTitle("Bouncers");

        // Dont forget to add the keyLiestener into our Bouncer.Displayer.FrameSingleton
        this.frame.getFrame().addKeyListener(this);
    }

    /**
     * Main loop of the application that have to be called one time to run the whole
     * bouncers process
     */
    public void loop(){
        // Set up the repeated task that will update the subject states (seconds)
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                // Draw a white rectangle that fit the window to be able to display bouncableShapes without trace
                Graphics2D g2d = FrameSingleton.getInstance().getGraphics();
                g2d.setColor(Color.WHITE);
                g2d.fillRect(0, 0, FrameSingleton.getInstance().getWidth(), FrameSingleton.getInstance().getHeight());

                // Draw all bouncableShapes
                // We do not use iterator loop to avoid concurrent modification conflicts
                for (int i = 0; i < bouncers.size(); ++i) {
                    if(bouncers.get(i) != null) {
                        bouncers.get(i).move();
                        bouncers.get(i).draw();
                    }
                }

                // Force the frame to repaint with modification
                frame.repaint();
            }
        };

        long delay  = 0;
        long period = FRAME_RATE;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }

    /**
     * Operates action depending on user input (key pressing)
     * Either creates fill/outline shapes, erase all shapes or quit application
     * @param e The KeyEvent
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