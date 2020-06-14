package flyweight.website2;

/**
 * Created by GL-shala on 2020/6/14.
 * 所有具体享元类的超类或者接口，通过这个接口可以接受并作用于外部状态
 */
public interface WebSite {
    public void use(User user);
}
