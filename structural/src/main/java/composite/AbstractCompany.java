package composite;

/**
 * @ClassName AbstractCompany
 * @Description: TODO
 * @Author gengyongfang
 * @Date 2021/2/16
 * @Version V1.0
 **/
public abstract class AbstractCompany {
    protected String name;

    public AbstractCompany(String name) {
        this.name = name;
    }

    public void add(AbstractCompany company){};  // 添加

    public void remove(AbstractCompany company){};   // 删除

    public abstract void display(int depth);    // 显示

    public abstract void lineOfDuty();  // 履行职责

}
