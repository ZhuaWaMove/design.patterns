package flyweight.website2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GL-shala on 2020/6/14.
 */
public class WebSiteFactory {

    private static Map<String, WebSite> webSite = new HashMap<>();

    public WebSite getWebSiteCategory(String name) {
        if (!webSite.containsKey(name)) {
            webSite.put(name, new ConcreteWebSite(name));
        }
        return webSite.get(name);
    }

    public int getWebSiteCount() {
        return webSite.size();
    }

    public static void main(String[] args) {

        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite x = webSiteFactory.getWebSiteCategory("产品展示");
        x.use(new User("小菜"));

        WebSite y = webSiteFactory.getWebSiteCategory("产品展示");
        y.use(new User("高米店"));

        WebSite z = webSiteFactory.getWebSiteCategory("产品展示");
        z.use(new User("丰台"));

       WebSite x1 = webSiteFactory.getWebSiteCategory("博客");
        x1.use(new User("大兴"));

        WebSite y1 = webSiteFactory.getWebSiteCategory("博客");
        y1.use(new User("海淀"));

        WebSite z1 = webSiteFactory.getWebSiteCategory("博客");
        z1.use(new User("兴源"));

        System.out.println("网站总数： " + webSiteFactory.getWebSiteCount());

    }
}
