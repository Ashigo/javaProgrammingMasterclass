public class AreaCalculator {
    //  AreaCalculator
    //  Write a method named area with one double parameter named radius.
    //  The method needs to return a double value that represents the area of a circle.
    //  Write another overloaded method with 2 parameters x and y (both doubles),
    //  where x and y represent the sides of a rectangle.
    //
    //  Examples of input/output:
    //      area(5.0); should return 78.53975
    //      area(-1);  should return -1 since the parameter is negative
    //      area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
    //      area(-1.0, 4.0);  should return -1 since first the parameter is negative
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}
