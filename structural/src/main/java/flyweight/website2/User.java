package flyweight.website2;

/**
 * Created by GL-shala on 2020/6/14.
 * 用户类 用于网站的客户账号 是网站类的外部状态
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
