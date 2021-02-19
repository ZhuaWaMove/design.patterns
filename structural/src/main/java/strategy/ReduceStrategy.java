package strategy;

/**
 * @ClassName RebateStrategy
 * @Description: 满1000减200策略
 * @Author gengyongfang
 * @Date 2021/2/19
 * @Version V1.0
 **/
public class ReduceStrategy implements IStrategy {

    @Override
    public double realPrice(double consumePrice) {
        if ((consumePrice >= 1000)) {
            return consumePrice - 200;
        }
        return consumePrice;
    }
}
