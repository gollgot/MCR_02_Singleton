/*
 * File: Bouncer.Factory.SquareFill.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Factory;

import Bouncer.Renderer.BouncableFillRenderer;
import Bouncer.Renderer.Renderable;
import Bouncer.Square;

import java.awt.*;

public class SquareFill extends Square {

    private final static Color color = Color.ORANGE;

    /**
     * Constructor for a concrete fill square
     */
    public SquareFill() {
        super(color);
    }

    /**
     * Return the good Renderer to use to draw a fill square
     * @return The Renderer instance for a fill square
     */
    @Override
    public Renderable getRenderer() {
        return BouncableFillRenderer.getInstance();
    }
}
