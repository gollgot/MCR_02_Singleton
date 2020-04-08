/*
 * File: Bouncer.Circle.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends BouncableShape {

    /**
     * Constructor
     * @param color The circle color
     */
    public Circle(Color color) {
        super(color);
    }

    /**
     * Return the Shape object of the circle
     * @return A circle Shape object
     */
    public Shape getShape() {
        return new Ellipse2D.Float(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}
