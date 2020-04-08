/*
 * File: Bouncer.Renderer.Renderable.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Renderer;

import Bouncer.Bouncable;

import java.awt.*;

public interface Renderable {
    void display(Graphics2D g, Bouncable b);
}
