import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleFill extends Circle {

    private final static Color color = Color.BLUE;

    /**
     * Constructor for a concrete fill circle
     */
    public CircleFill() {
        super(color);
    }

    /**
     * Return the good renderer to use to draw a fill circle
     * @return The Renderer instance for a fill circle
     */
    @Override
    public Renderable getRenderer() {
        return BouncableFillRenderer.getInstance();
    }
}
