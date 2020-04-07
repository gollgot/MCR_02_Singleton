import java.awt.*;

public abstract class Square extends BouncableShape {

    /**
     * Constructor
     * @param color The square color
     */
    public Square(Color color) {
        super(color);
    }

    /**
     * Return the Shape object of the square
     * @return A square Shape object
     */
    public Shape getShape() {
        return new Rectangle(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}
