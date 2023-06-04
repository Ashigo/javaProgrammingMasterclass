public class LeapYear {
    //  LeapYear
    //  Write a method isLeapYear with a parameter of type int named year.
    //  The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    //  If the parameter is not in that range return false.
    //  Otherwise, if it is in the valid range, calculate if the year is a leap year and return true
    //  if it is a leap year, otherwise return false.
    //
    //  Examples of input/output:
    //      isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
    //      isLeapYear(1600); → should return true since 1600 is a leap year
    //      isLeapYear(2017); → should return false since 2017 is not a leap year
    //      isLeapYear(2000);  → should return true because 2000 is a leap year
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
