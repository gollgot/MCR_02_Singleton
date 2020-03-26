import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends BouncableShape {

    public Circle() {
        super(Color.RED);
    }

    @Override
    public void draw() {
        Graphics2D g2d = FrameSingleton.getInstance().getGraphics();
        super.getRenderer().display(g2d, this);
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Float(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}
