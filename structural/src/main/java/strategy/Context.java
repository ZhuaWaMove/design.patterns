package strategy;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * @ClassName Context
 * @Description: 策略模式的上下文 使用策略对象
 * @Author gengyongfang
 * @Date 2021/2/19
 * @Version V1.0
 **/
public class Context {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {

        this.strategy = strategy;
    }

    /**
     * 使用策略计算价格
     *
     * @param consumePrice 真实价格
     * @return 优惠后的价格
     */
    public double cul(double consumePrice) {
        if (strategy == null) {
            return consumePrice;
        }
        //计算实际价格
        double v = strategy.realPrice(consumePrice);
        //保留小数点后一位
        BigDecimal bigDecimal = new BigDecimal(v);
        bigDecimal = bigDecimal.setScale(1, BigDecimal.ROUND_DOWN);
        return bigDecimal.doubleValue();
    }
}
