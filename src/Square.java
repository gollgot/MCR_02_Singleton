import java.awt.*;

public abstract class Square extends BouncableShape {

    public Square() {
        super(Color.BLUE);
    }

    public abstract Shape getShape();

}
