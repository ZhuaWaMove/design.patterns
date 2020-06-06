package decorator.framework;

/**
 * Created by GL-shala on 2020/6/6.
 */
public class BorderDecorator extends Decorator {
    public BorderDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public void draw() {

        VisualComponent component = getVisualComponent();
        String name = component.getClass().getName();
        component.draw();
        System.out.println("开始为" + name + "增加新的职责：drawBorder");
        drawBorder();
        System.out.println("结束为" + name + "增加新的职责：drawBorder");

    }

    public void drawBorder() {
        System.out.println("drawBorder...");
    }
}
