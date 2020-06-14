package flyweight.structure;

/**
 * Created by GL-shala on 2020/6/14.
 * 所有具体享元类的超类或者接口，通过这个接口可以接受并作用于外部状态
 */
public interface Flyweight {
    public void operation(int extrinsicState);

    public static void main(String[] args) {
        int extrinsicState = 99; // 外部状态
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight x = flyweightFactory.getFlyweights("x");
        x.operation(extrinsicState);

        Flyweight y = flyweightFactory.getFlyweights("y");
        y.operation(extrinsicState);

        Flyweight z = flyweightFactory.getFlyweights("z");
        z.operation(extrinsicState);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.operation(extrinsicState);



    }
}
