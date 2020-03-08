import java.awt.*;
import java.util.Random;

abstract class Shape {

    private int x, y;
    private int width, height;
    private Color color;
    private int xDirection;
    private int yDirection;

    private final int MAX_SIZE = 15;
    private final int MIN_SIZE = 10;

    public Shape(Color color) {
        FrameSingleton frame = FrameSingleton.getInstance();
        Random random = new Random();

        this.x = random.nextInt(frame.getWidth() - 2) + 1;
        this.y = random.nextInt(frame.getHeight() - 2) + 1;

        int randSize = random.nextInt((MAX_SIZE + 1) - MIN_SIZE) + MIN_SIZE;
        this.width = randSize;
        this.height = randSize;
        this.color = color;

        xDirection = generateRandomDirection();
        yDirection = generateRandomDirection();
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

    private int generateRandomDirection(){
        final int maxExcludeBorn = 3;
        final int minNegativeIncludeBorn = 2;

        Random random = new Random();
        int rand = random.nextInt(maxExcludeBorn + minNegativeIncludeBorn) - minNegativeIncludeBorn;
        // Exclude the 0 => otherwise the shape won't move
        while(rand == 0){
            rand = random.nextInt(maxExcludeBorn + minNegativeIncludeBorn) - minNegativeIncludeBorn;
        }

        return rand;
    }

}
