package decorator.framework;

/**
 * Created by GL-shala on 2020/6/6.
 */
public abstract class Decorator implements VisualComponent {

    private VisualComponent visualComponent;

    public Decorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    public void draw() {
        System.out.println("Decorator default draw....");
        visualComponent.draw();
    }

    public VisualComponent getVisualComponent() {
        return visualComponent;
    }
}
