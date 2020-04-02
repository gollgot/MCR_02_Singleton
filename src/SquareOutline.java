import java.awt.*;

public class SquareOutline extends Square {
    @Override
    public Shape getShape() {
        return new Rectangle(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
}
