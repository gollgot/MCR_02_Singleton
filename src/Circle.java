import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends BouncableShape {

    public Circle(Color color) {
        super(color);
    }

    public Shape getShape() {
        return new Ellipse2D.Float(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}
