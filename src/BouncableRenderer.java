import java.awt.*;

public class BouncableRenderer implements Renderable {

    private static BouncableRenderer instance;

    private BouncableRenderer() {}

    public static BouncableRenderer getInstance(){
        if(instance == null){
            instance = new BouncableRenderer();
        }

        return instance;
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}
