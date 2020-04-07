import java.awt.*;

public class SquareFill extends Square {

    private final static Color color = Color.ORANGE;

    /**
     * Constructor for a concrete fill square
     */
    public SquareFill() {
        super(color);
    }

    /**
     * Return the good renderer to use to draw a fill square
     * @return The Renderer instance for a fill square
     */
    @Override
    public Renderable getRenderer() {
        return BouncableFillRenderer.getInstance();
    }
}
