package composite;

/**
 * @ClassName FinanceDepartment
 * @Description: TODO
 * @Author gengyongfang
 * @Date 2021/2/16
 * @Version V1.0
 **/
public class IMDepartment extends AbstractCompany {
    public IMDepartment(String name) {
        super(name);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.printf("%s 公司综合管理管理%n", name);
    }


}
