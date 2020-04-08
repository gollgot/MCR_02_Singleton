/*
 * File: Bouncer.Factory.SquareOutline.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Factory;

import Bouncer.Renderer.BouncableOutlineRenderer;
import Bouncer.Renderer.Renderable;
import Bouncer.Square;

import java.awt.*;

public class SquareOutline extends Square {

    private final static Color color = Color.RED;

    /**
     * Constructor for a concrete outline square
     */
    public SquareOutline() {
        super(color);
    }

    /**
     * Return the good Renderer to use to draw an outline square
     * @return The Renderer instance for an outline square
     */
    @Override
    public Renderable getRenderer() {
        return BouncableOutlineRenderer.getInstance();
    }
}
