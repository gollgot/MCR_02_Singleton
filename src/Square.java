import java.awt.*;
import java.util.concurrent.RecursiveTask;

public class Square extends BouncableShape {

    public Square() {
        super(Color.BLUE);
    }

    @Override
    public void draw() {
        Graphics2D g2d = FrameSingleton.getInstance().getGraphics();
        g2d.setColor(super.getColor());
        g2d.draw(getShape());
    }

    @Override
    public Renderable getRenderer() {
        return null;
    }

    @Override
    public Shape getShape() {
        return new Rectangle(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
}
