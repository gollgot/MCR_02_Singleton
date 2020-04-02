public class FactoryOutline extends BouncableFactory {
    @Override
    public Square createSquare() {
        return new SquareOutline();
    }

    @Override
    public Circle createCircle() {
        return new CircleOutline();
    }
}
