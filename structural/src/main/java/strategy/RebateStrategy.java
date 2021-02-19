package strategy;

/**
 * @ClassName RebateStrategy
 * @Description: 折扣策略
 * @Author gengyongfang
 * @Date 2021/2/19
 * @Version V1.0
 **/
public class RebateStrategy implements IStrategy{
    private final double rate;

    public RebateStrategy() {
        rate = 0.8;
    }

    @Override
    public double realPrice(double consumePrice) {
        return consumePrice * this.rate;
    }
}
