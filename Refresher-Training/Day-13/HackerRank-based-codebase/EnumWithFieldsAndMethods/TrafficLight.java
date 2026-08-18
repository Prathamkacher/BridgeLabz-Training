package EnumWithFieldsAndMethods;

public enum TrafficLight {
    RED(30),
    YELLOW(5),
    GREEN(25);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    int getDuration() {
        return duration;
    }
}
