public class FactoryFill extends BouncableFactory {
    @Override
    public Square createSquare() {
        return new SquareFill();
    }

    @Override
    public Circle createCircle() {
        return new CircleFill();
    }
}
