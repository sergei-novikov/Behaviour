package behaviour.strategy;
/**
 * Продажа рекламы
 */
 public class AdvertisingSalesBehavior implements MakeMoneyBehavior {

    @Override
    public void makeMoney() {
        System.out.println("Making money by advertising sales");
    }

}
