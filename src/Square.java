import java.awt.*;

public class Square {
    private int x, y;
    private final int WIDTH = 10;
    private final int HEIGHT = 10;
    private Color color = Color.BLUE;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g){
        Image image = FrameSingleton.getInstance().getImage();
        Graphics2D g2 = (Graphics2D) image.getGraphics();
        g2.setColor(this.color);
        g2.fillRect(x++, y++, WIDTH, HEIGHT);
    }


}
