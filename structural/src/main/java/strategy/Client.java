package strategy;

import java.util.Random;

/**
 * @ClassName Client
 * @Description: 客户端使用
 * @Author gengyongfang
 * @Date 2021/2/19
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {

        Context context = new Context();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(3);
            double consumePrice;
            while ((consumePrice = random.nextInt(2000)) == 0) {
            }
            switch (i1) {
                case 0:
                    //打8折
                    context.setStrategy(new RebateStrategy());
                    System.out.println("【打八折】商品");
                    break;
                case 1:
                    //满200 高于200部分打8折
                    context.setStrategy(new PromotionalStrategy());
                    System.out.println("【高于200部分打8折】商品");
                    break;
                case 2:
                    //满1000 减200
                    context.setStrategy(new ReduceStrategy());
                    System.out.println("【满1000减200】商品");
                    break;

            }
            System.out.println("原价：" + consumePrice + "优惠后的价格：" + context.cul(consumePrice));
        }
    }
}
