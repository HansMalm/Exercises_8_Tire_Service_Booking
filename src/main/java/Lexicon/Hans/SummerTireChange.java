package Lexicon.Hans;

public class SummerTireChange extends Service {

    private String serviceDuration;
    private final int servicePrice;

    public SummerTireChange(int id, String name, int basePrice, String serviceDuration, int servicePrice) {
        super(id, name, basePrice);
        this.serviceDuration = serviceDuration;
        this.servicePrice = servicePrice;
    }

    public String getServiceDuration() {
        return serviceDuration;
    }

    public int getServicePrice() {
        return servicePrice;
    }
}
