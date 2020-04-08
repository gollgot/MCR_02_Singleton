/*
 * File: Bouncer.Factory.CircleFill.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Factory;

import Bouncer.Renderer.BouncableFillRenderer;
import Bouncer.Circle;
import Bouncer.Renderer.Renderable;

import java.awt.*;

public class CircleFill extends Circle {

    private final static Color color = Color.BLUE;

    /**
     * Constructor for a concrete fill circle
     */
    public CircleFill() {
        super(color);
    }

    /**
     * Return the good Renderer to use to draw a fill circle
     * @return The Renderer instance for a fill circle
     */
    @Override
    public Renderable getRenderer() {
        return BouncableFillRenderer.getInstance();
    }
}
