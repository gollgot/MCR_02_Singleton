/**
 * Factory Singleton class to represent a FactoryFill that can be use to create "Fill" object
 * (Square or Circle)
 */
public class FactoryFill extends BouncableFactory {

    private static FactoryFill instance;

    /**
     * Private constructor because this is a singleton class
     */
    private FactoryFill(){}

    /**
     * Return a unique instance of FactoryFill
     * @return A new instance if this is the first time, the current one otherwise
     */
    public static FactoryFill getInstance(){
        if(instance == null){
            instance = new FactoryFill();
        }

        return instance;
    }

    /**
     * Create a SquareFill
     * @return A new SquareFill
     */
    @Override
    public Square createSquare() {
        return new SquareFill();
    }

    /**
     * Create a CircleFill
     * @return A new CircleFill
     */
    @Override
    public Circle createCircle() {
        return new CircleFill();
    }
}
