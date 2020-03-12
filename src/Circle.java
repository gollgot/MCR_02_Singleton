import java.awt.*;

public class Circle extends Shape {

    public Circle() {
        super(Color.RED);
    }

    @Override
    void draw(Graphics2D g2d) {
        g2d.setColor(super.getColor());
        g2d.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

    @Override
    public void draw() {

    }

    @Override
    public Renderable getRenderer() {
        return null;
    }

    @Override
    public Shape getShape() {
        return null;
    }
}
