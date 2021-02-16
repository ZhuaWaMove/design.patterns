package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteCompany
 * @Description: TODO
 * @Author gengyongfang
 * @Date 2021/2/16
 * @Version V1.0
 **/
public class ConcreteCompany extends AbstractCompany {
    private List<AbstractCompany> companies = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompany company) {
        companies.add(company);
    }

    @Override
    public void remove(AbstractCompany company) {
        companies.remove(companies);
    }

    @Override
    public void display(int depth) {
        toDisplay(depth);
        for (AbstractCompany c : companies) {
            c.display(depth + 2);
        }
    }

    private void toDisplay(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        for (AbstractCompany c : companies) {
            c.lineOfDuty();
        }
    }

}
