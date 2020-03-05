import java.awt.*;

public class Square {
    private int x, y;
    private Color color = Color.BLUE;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;

        FrameSingleton frame = FrameSingleton.getInstance();

        Graphics2D g = frame.getGraphics();
        g.setColor(this.color);
        g.drawRect(x, y, 30, 30);
        frame.repaint();
    }


}
