/*
 * File: Bouncer.Bouncable.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer;

import Bouncer.Renderer.Renderable;

import java.awt.*;

public interface Bouncable {
    void draw();
    void move();
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}
