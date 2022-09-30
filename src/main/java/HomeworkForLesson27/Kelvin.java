package HomeworkForLesson27;

public class Kelvin extends AbstractTemperatureUnit{
    @Override
    public long convertToOrigin(long t) {
        return t;
    }
    @Override
    public double toFahrenheit(long t) {
        return (t - 273.15) * 9/5 + 32;
    }
    @Override
    public double toCelsius(long t) {
        return (t - 32) * 5/9;
    }
}

