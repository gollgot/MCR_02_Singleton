/*
 * File: SquareOutline.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

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
     * Return the good renderer to use to draw an outline square
     * @return The Renderer instance for an outline square
     */
    @Override
    public Renderable getRenderer() {
        return BouncableOutlineRenderer.getInstance();
    }
}
