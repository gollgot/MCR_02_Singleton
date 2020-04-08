/*
 * File: FactoryOutline.java
 * Authors: Robin Demarta & Loïc Dessaules
 * Date: 08.04.2020
 */

/**
 * Factory Singleton class to represent a FactorOutline that can be use to create "Outline" object
 * (Square or Circle)
 */
public class FactoryOutline extends BouncableFactory {

    private static FactoryOutline instance;

    /**
     * Private constructor because this is a singleton class
     */
    private FactoryOutline(){}

    /**
     * Return a unique instance of FactoryOutline
     * @return A new instance if this is the first time, the current one otherwise
     */
    public static FactoryOutline getInstance(){
        if(instance == null){
            instance = new FactoryOutline();
        }

        return instance;
    }

    /**
     * Create a SquareOutline
     * @return A new SquareOutline
     */
    @Override
    public Square createSquare() {
        return new SquareOutline();
    }

    /**
     * Create a CircleOutline
     * @return A new CircleOutline
     */
    @Override
    public Circle createCircle() {
        return new CircleOutline();
    }
}
