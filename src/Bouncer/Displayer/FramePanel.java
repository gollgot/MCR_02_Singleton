/*
 * File: Bouncer.Displayer.FramePanel.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Displayer;

import javax.swing.*;
import java.awt.*;

/**
 * Create our own Panel class to be able to have the paint override method.
 * This way the operating system will call himself the paint() method ad we'll have a good
 * frame refresh rate and avoid some blinking.
 */
public class FramePanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Draw the image (that contains all our bouncers) on the panel
        g.drawImage(FrameSingleton.getInstance().getImage(), 0, 0, null);
    }
}
