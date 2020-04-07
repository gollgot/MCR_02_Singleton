import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleOutline extends Circle {

    private final static Color color = Color.GREEN;

    /**
     * Constructor for a concrete outline circle
     */
    public CircleOutline() {
        super(color);
    }

    /**
     * Return the good renderer to use to draw an outline circle
     * @return The Renderer instance for an outline circle
     */
    @Override
    public Renderable getRenderer() {
        return BouncableOutlineRenderer.getInstance();
    }

}
