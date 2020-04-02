import java.awt.*;

public class BouncableFillRenderer implements Renderable {

    private static BouncableFillRenderer instance;

    private BouncableFillRenderer() {}

    public static BouncableFillRenderer getInstance(){
        if(instance == null){
            instance = new BouncableFillRenderer();
        }

        return instance;
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
        g.draw(b.getShape());
    }
}
