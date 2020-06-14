package flyweight.website1;

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
        x.use();

        WebSite y = webSiteFactory.getWebSiteCategory("产品展示");
        y.use();

        WebSite z = webSiteFactory.getWebSiteCategory("产品展示");
        z.use();

       WebSite x1 = webSiteFactory.getWebSiteCategory("博客");
        x1.use();

        WebSite y1 = webSiteFactory.getWebSiteCategory("博客");
        y1.use();

        WebSite z1 = webSiteFactory.getWebSiteCategory("博客");
        z1.use();

        System.out.println("网站总数： " + webSiteFactory.getWebSiteCount());

    }
}
