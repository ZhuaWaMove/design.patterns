package decorator.framework;

/**
 * Created by GL-shala on 2020/6/6.
 */
public class TestDecorator {
    public static void main(String[] args) {
        VisualComponent vc = new TextView();
        BorderDecorator bd = new BorderDecorator(vc);
        ScrollDecorator sd = new ScrollDecorator(bd);
        sd.draw();
    }
}
