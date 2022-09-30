package HomeworkForLesson27;


public class Main {
    public static void main(String[] args) {

        System.out.println("Celsius to Celsius");
        System.out.println(ConvertFactory.Celsius.createTemperatureUnit().convertToOrigin(15));

        System.out.println("Celsius to Kelvin");
        System.out.println(ConvertFactory.Celsius.createTemperatureUnit().toKelvin(12));

        System.out.println("Kelvin to Fahrenheit");
        System.out.println(ConvertFactory.Kelvin.createTemperatureUnit().toFahrenheit(56));

        System.out.println("Fahrenheit to Celsius");
        System.out.println(ConvertFactory.Fahrenheit.createTemperatureUnit().toCelsius(90));

    }
}
