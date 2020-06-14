package flyweight.structure;

/**
 * Created by GL-shala on 2020/6/14.
 * 不需要共享的Flyweight，Flyweight兵部要求接口一定要共享
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体flyweight" + extrinsicState);
    }
}
