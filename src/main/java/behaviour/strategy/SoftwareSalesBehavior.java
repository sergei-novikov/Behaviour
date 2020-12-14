package behaviour.strategy;

/**
 * Продажи ПО
 */
 public class SoftwareSalesBehavior implements MakeMoneyBehavior {

    @Override
    public void makeMoney() {
        System.out.println("Making money by software sales");
    }
}
