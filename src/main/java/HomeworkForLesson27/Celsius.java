package HomeworkForLesson27;

public class Celsius extends AbstractTemperatureUnit {

    @Override
    public long convertToOrigin(long t) {
        return t;
    }

    @Override
    public double toFahrenheit(long t) {
        return t * 9 / 5 + 32;
    }

    @Override
    public double toKelvin(long t) {
        return t + 273.15;
    }

}