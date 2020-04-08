/*
 * File: Bouncer.Factory.BouncableFactory.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Factory;

import Bouncer.Circle;
import Bouncer.Square;

public abstract class BouncableFactory {
    public abstract Square createSquare();
    public abstract Circle createCircle();
}
