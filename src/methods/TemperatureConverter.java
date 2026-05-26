package methods;

public class TemperatureConverter {

        static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

        static double celsiusToKelvin(double celsius) {
            return celsius + 273.15;
        }

        static double kelvinToCelsius(double kelvin) {
            return kelvin - 273.15;
        }

        public static void main(String[] args) {

            System.out.println("Celsius to Fahrenheit: "
                    + celsiusToFahrenheit(37));

            System.out.println("Fahrenheit to Celsius: "
                    + fahrenheitToCelsius(98.6));

            System.out.println("Celsius to Kelvin: "
                    + celsiusToKelvin(25));

            System.out.println("Kelvin to Celsius: "
                    + kelvinToCelsius(300));
        }
    }

