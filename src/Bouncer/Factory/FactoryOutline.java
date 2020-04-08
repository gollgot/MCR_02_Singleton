/*
 * File: Bouncer.Factory.FactoryOutline.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Factory;

import Bouncer.Circle;
import Bouncer.Square;

/**
 * Factory Singleton class to represent a FactorOutline that can be use to create "Outline" object
 * (Bouncer.Square or Bouncer.Circle)
 */
public class FactoryOutline extends BouncableFactory {

    private static FactoryOutline instance;

    /**
     * Private constructor because this is a singleton class
     */
    private FactoryOutline(){}

    /**
     * Return a unique instance of Bouncer.Factory.FactoryOutline
     * @return A new instance if this is the first time, the current one otherwise
     */
    public static FactoryOutline getInstance(){
        if(instance == null){
            instance = new FactoryOutline();
        }

        return instance;
    }

    /**
     * Create a Bouncer.Factory.SquareOutline
     * @return A new Bouncer.Factory.SquareOutline
     */
    @Override
    public Square createSquare() {
        return new SquareOutline();
    }

    /**
     * Create a Bouncer.Factory.CircleOutline
     * @return A new Bouncer.Factory.CircleOutline
     */
    @Override
    public Circle createCircle() {
        return new CircleOutline();
    }
}
