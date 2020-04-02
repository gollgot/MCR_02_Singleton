public class FactoryFill extends BouncableFactory {

    private static FactoryFill instance;

    public static FactoryFill getInstance(){
        if(instance == null){
            instance = new FactoryFill();
        }

        return instance;
    }

    @Override
    public Square createSquare() {
        return new SquareFill();
    }

    @Override
    public Circle createCircle() {
        return new CircleFill();
    }
}
