/*
 * File: Bouncer.Factory.FactoryFill.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

package Bouncer.Factory;

import Bouncer.Circle;
import Bouncer.Square;

/**
 * Factory Singleton class to represent a Bouncer.Factory.FactoryFill that can be use to create "Fill" object
 * (Bouncer.Square or Bouncer.Circle)
 */
public class FactoryFill extends BouncableFactory {

    private static FactoryFill instance;

    /**
     * Private constructor because this is a singleton class
     */
    private FactoryFill(){}

    /**
     * Return a unique instance of Bouncer.Factory.FactoryFill
     * @return A new instance if this is the first time, the current one otherwise
     */
    public static FactoryFill getInstance(){
        if(instance == null){
            instance = new FactoryFill();
        }

        return instance;
    }

    /**
     * Create a Bouncer.Factory.SquareFill
     * @return A new Bouncer.Factory.SquareFill
     */
    @Override
    public Square createSquare() {
        return new SquareFill();
    }

    /**
     * Create a Bouncer.Factory.CircleFill
     * @return A new Bouncer.Factory.CircleFill
     */
    @Override
    public Circle createCircle() {
        return new CircleFill();
    }
}
