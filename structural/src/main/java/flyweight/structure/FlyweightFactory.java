package flyweight.structure;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GL-shala on 2020/6/14.
 * 享元工厂用来创建并管理flyweight对象，确保合理的共享flyweight类，当用户请求一个flyweight对象时，flyweightFactory提供一个
 * 已创建或者创建一个(如果不存在的话)
 */
public class FlyweightFactory {

    private static final Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
//    事先初始化三个共享flyweights，也可以延迟
    public FlyweightFactory() {
        flyweights.put("x", new ConcreteFlyweight());
        flyweights.put("y", new ConcreteFlyweight());
        flyweights.put("z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweights(String name){
        return flyweights.getOrDefault(name, (int extrinsicState) -> {
            throw new NoClassDefFoundError();
        });
    }
}
