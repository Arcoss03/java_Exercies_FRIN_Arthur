
class Exo11 {
    static public class Temperature {
        int celsius;
        double fahrenheit;

        //formule de conversion de celsius en fahrenheit: (0°C × 9/5) + 32 = 32°F
        public static Temperature[] calculTemperatures() {
            Temperature[] temperatures = new Temperature[21];
            int index = 0;
            for (int celsius = -50; celsius <= 50; celsius += 5) {
                double fahrenheit = celsius * 9.0 / 5.0 + 32;
                Temperature temperature = new Temperature();
                temperature.celsius = celsius;
                temperature.fahrenheit = fahrenheit;
                temperatures[index] = temperature;
                index++;
            }
            return temperatures;

        }

        public static void printTemperatures(Temperature[] temperatures) {
            for (Temperature temp : temperatures) {
                if (temp != null) {
                    System.out.println(temp.celsius + "°C = " + temp.fahrenheit + "°F");
                }
            }
        }
    }

    public static void main(String[] args) {
        Temperature[] temperatures = Temperature.calculTemperatures();
        Temperature.printTemperatures(temperatures);
    }
}