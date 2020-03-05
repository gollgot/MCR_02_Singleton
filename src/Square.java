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
        // BUG -> Ca va clear a chaque rectabgle donc il en restera que 1 au final (le dernier) to refactor
        // Clear the image with a white background
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, FrameSingleton.getInstance().getWidth(), FrameSingleton.getInstance().getHeight());

        g2.setColor(this.color);
        g2.fillRect(x++, y++, WIDTH, HEIGHT);
    }


}
