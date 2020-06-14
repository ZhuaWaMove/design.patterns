package flyweight.unflyweight;

/**
 * Created by GL-shala on 2020/6/14.
 * 非享元模式
 * 网站代码
 */
public class WebSite {

    private String name;

    public WebSite(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("网站分类：" + name);
    }

    /**
     * 问题：3个客户每个客户需要2个网站(产品展示和博客)
     * 使用这段代码需要创建6个实例并且数据库需要六份，当客户增多时必然带来资源使用严重增加的问题。
     * <p>
     * 只是应为客户端不同，客户数据不同。如何共享这些资源呢？
     */
    public static void main(String[] args) {

        WebSite fx = new WebSite("产品展示");
        fx.use();
        WebSite fy = new WebSite("产品展示");
        fy.use();
        WebSite fz = new WebSite("产品展示");
        fz.use();

        WebSite bx = new WebSite("博客");
        bx.use();
        WebSite by = new WebSite("博客");
        by.use();
        WebSite bz = new WebSite("博客");
        bz.use();
    }

}
