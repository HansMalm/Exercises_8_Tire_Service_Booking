package Lexicon.Hans;

public class SummerTireChange extends Service {

    private String serviceDuration;
    private final int servicePrice;

    public SummerTireChange(int id, String name, int basePrice, int servicePrice, String serviceDuration) {
        super(id, name, basePrice);
        this.servicePrice = servicePrice;
        this.serviceDuration = serviceDuration;
    }

    public String getServiceDuration() {
        return serviceDuration;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    @Override
    public int calculatePrice() {
        return getBasePrice() + servicePrice;
    }
}
