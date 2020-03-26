import java.awt.*;

public class Square extends BouncableShape {

    public Square() {
        super(Color.BLUE);
    }

    @Override
    public void draw() {
        Graphics2D g2d = FrameSingleton.getInstance().getGraphics();
        super.getRenderer().display(g2d, this);
    }

    @Override
    public Shape getShape() {
        return new Rectangle(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}
