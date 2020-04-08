/*
 * File: Bouncer.Renderer.BouncableFillRenderer.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Renderer;

import Bouncer.Bouncable;

import java.awt.*;

/**
 * Singleton class to represent a Fill Renderer for bouncable
 */
public class BouncableFillRenderer implements Renderable {

    private static BouncableFillRenderer instance;

    /**
     * Private constructor because this is a singleton class
     */
    private BouncableFillRenderer() {}

    /**
     * Return a unique instance of Bouncer.Renderer.BouncableFillRenderer
     * @return A new instance if this is the first time, the current one otherwise
     */
    public static BouncableFillRenderer getInstance(){
        if(instance == null){
            instance = new BouncableFillRenderer();
        }

        return instance;
    }

    /**
     * Display a Fill bouncer
     * @param g The Graphics2D to use
     * @param b The Bouncer.Bouncable to display with "fill" mode
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
        g.draw(b.getShape());
    }
}
