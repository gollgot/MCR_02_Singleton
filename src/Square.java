import java.awt.*;

public abstract class Square extends BouncableShape {

    public Square(Color color) {
        super(color);
    }

    public Shape getShape() {
        return new Rectangle(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}
