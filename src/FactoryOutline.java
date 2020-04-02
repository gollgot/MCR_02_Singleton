public class FactoryOutline extends BouncableFactory {

    private static FactoryOutline instance;

    public static FactoryOutline getInstance(){
        if(instance == null){
            instance = new FactoryOutline();
        }

        return instance;
    }

    @Override
    public Square createSquare() {
        return new SquareOutline();
    }

    @Override
    public Circle createCircle() {
        return new CircleOutline();
    }
}
