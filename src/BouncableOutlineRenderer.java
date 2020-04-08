/*
 * File: BouncableOutlineRenderer.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

import java.awt.*;

/**
 * Singleton class to represent an Outline Renderer for bouncable
 */
public class BouncableOutlineRenderer implements Renderable {

    private static BouncableOutlineRenderer instance;

    /**
     * Private constructor because this is a singleton class
     */
    private BouncableOutlineRenderer() {}

    /**
     * Return a unique instance of BouncableOutlineRenderer
     * @return A new instance if this is the first time, the current one otherwise
     */
    public static BouncableOutlineRenderer getInstance(){
        if(instance == null){
            instance = new BouncableOutlineRenderer();
        }

        return instance;
    }

    /**
     * Display an Outline bouncer
     * @param g The Graphics2D to use
     * @param b The Bouncable to display with "outline" mode
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}
