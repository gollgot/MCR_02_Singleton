/*
 * File: Displayer.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

import java.awt.*;

public interface Displayer {
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String s);
}
