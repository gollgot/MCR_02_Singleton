import java.awt.*;
import java.util.Random;

abstract class BouncableShape implements Bouncable {

    private int x, y;
    private int width, height;
    private Color color;
    private int xDirection;
    private int yDirection;

    private final int MAX_SIZE = 25;
    private final int MIN_SIZE = 10;

    /**
     * Create a new BouncableShape with random position in the frame, random direction and random size
     * @param color The color of the BouncableShape
     */
    public BouncableShape(Color color) {
        FrameSingleton frame = FrameSingleton.getInstance();
        Random random = new Random();

        this.x = random.nextInt(frame.getWidth() - 100) + 1;
        this.y = random.nextInt(frame.getHeight() - 100) + 1;

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

    /**
     * Update the current position of the shape
     */
    @Override
    public void move() {
        x += xDirection;
        y += yDirection;

        detectCollisions();
    }

    /**
     * Detect collision with the frame. If the BouncableShape go out the frame border,
     * it will come back inside the current frame size, This way this is responsive.
     */
    private void detectCollisions(){
        FrameSingleton frame = FrameSingleton.getInstance();

        if(x <= 0 ){
            xDirection *= -1;
        }else if( x > (frame.getWidth() - getWidth())){
            // This way the lost Shape will comeback inside the windows size
            xDirection = Math.abs(xDirection) * -1;
        }

        if(y <= 0 ){ // -30 because of the app name bar
            yDirection *= -1;
        }else if(y > (frame.getHeight() - getHeight() - 30)){
            // This way the lost Shape will comeback inside the windows size
            yDirection = Math.abs(yDirection) * -1;
        }

    }

    /**
     * Generate a random direction between [-2, 2] (0 exclude)
     * @return A random direction for the BouncableShape
     */
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

    /**
     * Draw the Bouncer
     */
    public void draw() {
        Graphics2D g2d = FrameSingleton.getInstance().getGraphics();
        // Get the good renderer with dynamic liaison.
        getRenderer().display(g2d, this);
    }

}
