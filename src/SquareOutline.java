import java.awt.*;

public class SquareOutline extends Square {

    private final static Color color = Color.RED;

    public SquareOutline() {
        super(color);
    }

    @Override
    public Shape getShape() {
        return new Rectangle(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

    @Override
    public Renderable getRenderer() {
        return BouncableOutlineRenderer.getInstance();
    }
}
