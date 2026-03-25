package Lexicon.Hans;

public class SummerTireChange extends Service {

    private String serviceDuration;

    public SummerTireChange(int id, String name, double basePrice, String serviceDuration) {
        super(id, name, basePrice);
        this.serviceDuration = serviceDuration;
    }

    public String getServiceDuration() {
        return serviceDuration;
    }
}
