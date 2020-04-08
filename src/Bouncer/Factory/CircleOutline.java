/*
 * File: Bouncer.Factory.CircleOutline.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Factory;

import Bouncer.Renderer.BouncableOutlineRenderer;
import Bouncer.Circle;
import Bouncer.Renderer.Renderable;

import java.awt.*;

public class CircleOutline extends Circle {

    private final static Color color = Color.GREEN;

    /**
     * Constructor for a concrete outline circle
     */
    public CircleOutline() {
        super(color);
    }

    /**
     * Return the good Renderer to use to draw an outline circle
     * @return The Renderer instance for an outline circle
     */
    @Override
    public Renderable getRenderer() {
        return BouncableOutlineRenderer.getInstance();
    }

}
