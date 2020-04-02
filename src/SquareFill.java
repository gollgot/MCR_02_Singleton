import java.awt.*;

public class SquareFill extends Square {

    private final static Color color = Color.ORANGE;

    public SquareFill() {
        super(color);
    }

    @Override
    public Renderable getRenderer() {
        return BouncableFillRenderer.getInstance();
    }
}
