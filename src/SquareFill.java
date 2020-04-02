import java.awt.*;

public class SquareFill extends Square {
    @Override
    public Shape getShape() {
        // TODO must be a filled shape
        return new Rectangle(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
}
