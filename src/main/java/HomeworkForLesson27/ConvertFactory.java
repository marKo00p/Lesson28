package HomeworkForLesson27;

public enum  ConvertFactory {

    Celsius {
        @Override
        public AbstractTemperatureUnit createTemperatureUnit() {
            return new Celsius();
        }
    },
    Kelvin {
        @Override
        public AbstractTemperatureUnit createTemperatureUnit() {
            return new Kelvin();
        }
    },
    Fahrenheit {
        @Override
        public AbstractTemperatureUnit createTemperatureUnit() {
            return new Kelvin();
        }
    };

    public abstract AbstractTemperatureUnit createTemperatureUnit();
}
