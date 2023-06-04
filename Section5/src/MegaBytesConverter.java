public class MegaBytesConverter {
    //    MegaBytes Converter
    //    The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
    //    Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
    //
    //    EXAMPLE INPUT/OUTPUT
    //        printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
    //        printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.
    //        printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainedKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainedKiloBytes + " KB");
        }
    }
}
