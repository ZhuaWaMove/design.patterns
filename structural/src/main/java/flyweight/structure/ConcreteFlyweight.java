package flyweight.structure;

/**
 * Created by GL-shala on 2020/6/14.
 * 为内部状态提供存储空间
 */
public class ConcreteFlyweight implements Flyweight {
    public void operation(int extrinsicState) {
        System.out.println("具体flyweight" + extrinsicState);
    }
}
