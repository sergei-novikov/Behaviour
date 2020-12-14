package behaviour.strategy;

/**
 * Агентсво цифровых услуг, реклама, маркетинг.
 */
public class DigitalAgency extends Company {

    public DigitalAgency() {
        setMakeMoney(new AdvertisingSalesBehavior());
    }
}
