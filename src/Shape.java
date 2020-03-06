import java.awt.*;

abstract class Shape {

    private int x, y;
    private int width, height;
    private Color color;
    private int xDirection = 1;
    private int yDirection = 1;

    public Shape(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void updatePosition(){
        x += xDirection;
        y += yDirection;
    }

    public void detectCollisions(){
        FrameSingleton frame = FrameSingleton.getInstance();

        if(x <= 0 || x >= (frame.getWidth() - width)){
            xDirection *= -1;
        }

        if(y <= 0 || y >= (frame.getHeight() - height)){
            yDirection *= -1;
        }
    }

    abstract void draw(Graphics2D g2d);

}
