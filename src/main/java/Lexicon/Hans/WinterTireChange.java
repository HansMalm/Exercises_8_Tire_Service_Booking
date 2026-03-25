package Lexicon.Hans;

public class WinterTireChange extends Service {

    private String serviceDuration;

    public WinterTireChange(int id, String name, double basePrice, String serviceDuration) {
        super(id, name, basePrice);
        this.serviceDuration = serviceDuration;
    }

    public String getServiceDuration() {
        return serviceDuration;
    }
}
