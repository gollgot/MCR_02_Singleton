import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleOutline extends Circle {
    @Override
    public Shape getShape() {
        return new Ellipse2D.Float(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}
