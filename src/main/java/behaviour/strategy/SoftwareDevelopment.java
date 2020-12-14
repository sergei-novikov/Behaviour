package behaviour.strategy;

/**
 * Фирма по разработке ПО
 */
public class SoftwareDevelopment extends Company {

    public SoftwareDevelopment() {
        setMakeMoney(new SoftwareSalesBehavior());
    }
}
