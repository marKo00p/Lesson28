package HomeworkForLesson27;

public class Fahrenheit extends AbstractTemperatureUnit {
    @Override
    public long convertToOrigin(long t) {
        return t;
    }
    @Override
    public double toCelsius(long t) {
        return 5/9 * (t - 32);
    }
    @Override
    public double toKelvin(long t) {
        return (t - 32) * 5/9 + 273.15;
    }
}

