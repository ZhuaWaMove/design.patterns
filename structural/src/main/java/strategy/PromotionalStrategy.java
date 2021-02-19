package strategy;

/**
 * @ClassName RebateStrategy
 * @Description: 满1000减200策略
 * @Author gengyongfang
 * @Date 2021/2/19
 * @Version V1.0
 **/
public class PromotionalStrategy implements IStrategy {

    private final double rate = 0.8;

    @Override
    public double realPrice(double consumePrice) {
        if ((consumePrice > 200)) {
            return 200 + (consumePrice - 200) * rate;
        }
        return consumePrice;
    }
}
