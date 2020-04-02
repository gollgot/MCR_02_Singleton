import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleFill extends Circle {
    @Override
    public Shape getShape() {
        // TODO must be a filled shape
        return new Ellipse2D.Float(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
}
