package Lexicon.Hans;

public class WinterTireChange extends Service {

    private String serviceDuration;

    public WinterTireChange(int id, String name, double basePrice, String serviceDuration) {
        super(id, name, basePrice);
        this.serviceDuration = serviceDuration;
    }

    @Override
    public double calculateServicePrice() {
        return getBasePrice() + 10;
    }
}
