package behaviour.strategy;

/**
 * Продажи консультаций
*/
public class ConsultationSalesBehavior implements MakeMoneyBehavior {

    @Override
    public void makeMoney() {
        System.out.println("Making money by consultation sales");
    }
}
