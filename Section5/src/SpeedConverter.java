public class SpeedConverter {
    //    Speed Converter
    //    calculate the value of miles per hour, round it and return it.
    //    Then it needs to print a message in the format "XX km/h = YY mi/h".
    //
    //    Examples of input/output:
    //      - printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
    //      - printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
    //      - printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
    //      - printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
    //      - printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h


    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double milesPerHour = kilometersPerHour / 1.609;

        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
