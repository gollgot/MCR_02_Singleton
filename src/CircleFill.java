import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleFill extends Circle {

    private final static Color color = Color.BLUE;

    public CircleFill() {
        super(color);
    }

    @Override
    public Renderable getRenderer() {
        return BouncableFillRenderer.getInstance();
    }
}
