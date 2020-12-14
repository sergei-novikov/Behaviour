package behaviour.strategy;

/**
 * Консалтинговая фирма
 */
public class ConsultingAgency extends Company {

    public ConsultingAgency() {
        setMakeMoney(new ConsultationSalesBehavior());
    }
}
