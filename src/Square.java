import java.awt.*;

public class Square extends Shape {

    public Square() {
        super(Color.BLUE);
    }

    @Override
    public void draw(Graphics2D g){
        g.setColor(super.getColor());
        g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }


}
