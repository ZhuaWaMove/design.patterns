package flyweight.website1;

/**
 * Created by GL-shala on 2020/6/14.
 */
public class ConcreteWebSite implements WebSite {
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类：" + name);
    }
}
