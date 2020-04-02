import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleOutline extends Circle {
    private final static Color color = Color.GREEN;

    public CircleOutline() {
        super(color);
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Float(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

    @Override
    public Renderable getRenderer() {
        return BouncableOutlineRenderer.getInstance();
    }

}
