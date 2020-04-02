import java.awt.*;

public abstract class Circle extends BouncableShape {

    public Circle() {
        super(Color.RED);
    }

    public abstract Shape getShape();

}
