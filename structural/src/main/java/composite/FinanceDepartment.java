package composite;

/**
 * @ClassName FinanceDepartment
 * @Description: TODO
 * @Author gengyongfang
 * @Date 2021/2/16
 * @Version V1.0
 **/
public class FinanceDepartment extends AbstractCompany {
    public FinanceDepartment(String name) {
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
        System.out.printf("%s 公司财务收支管理%n", name);
    }


}
