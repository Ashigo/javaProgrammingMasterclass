public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3856));
        System.out.println(getDurationString(-5));
        System.out.println(getDurationString(10004));
        System.out.println(getDurationString(100, 65));
        System.out.println(getDurationString(-100, 65));
        System.out.println(getDurationString(-100, -65));
        System.out.println(getDurationString(100, -65));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid data for seconds(" + seconds
                    + "), must be a positive integer value");
            return null;
        } else {
            int minutes = seconds / 60;
            int restSeconds = seconds % 60;
            return getDurationString(minutes, restSeconds);
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            System.out.println("Invalid data for minutes(" + minutes
                    + "), must be a positive integer value");
            return null;
        } else if (seconds < 0) {
            System.out.println("Invalid data for seconds(" + seconds
                    + "), must be a positive integer value");
            return null;
        } else if (seconds > 59) {
            System.out.println("Invalid data for seconds(" +seconds + ") value. It should be in range 0 - 59");
            return null;
        } else {
            int hours = minutes / 60;
            int restMinutes = minutes % 60;
            return hours + "h " + restMinutes + "m " + seconds + "s";
        }
    }
}
