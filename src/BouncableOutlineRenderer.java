import java.awt.*;

public class BouncableOutlineRenderer implements Renderable {

    private static BouncableOutlineRenderer instance;

    private BouncableOutlineRenderer() {}

    public static BouncableOutlineRenderer getInstance(){
        if(instance == null){
            instance = new BouncableOutlineRenderer();
        }

        return instance;
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}
