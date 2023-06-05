public class MethodOverloading {
    //  1 inch = 2.54 cm
    //  Write a method to convert inches to cm -- one  input parameter
    //
    //  1 foot = 12 inches
    //  Write overloading method to convert feet+inches to cm -- two input parameters
    public static void main(String[] args) {
        System.out.println("5ft, 9in = " + convertToCentimeters(5, 9) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters(int inches) {
        double cmInInch = 2.54;
        return inches * cmInInch;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int inchInFeet = 12;
        int totalInches = feet * inchInFeet + inches;
        return convertToCentimeters(totalInches);
    }

}
