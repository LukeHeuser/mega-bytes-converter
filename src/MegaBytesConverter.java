public class MegaBytesConverter {
    public static void main(String[] args) {
        int megaByte1 = printMegaBytesAndKiloBytes(15000);
        int megaByte2 = printMegaBytesAndKiloBytes(-50);
        int megaByte3 = printMegaBytesAndKiloBytes(1560513558);
        int megaByte4 = printMegaBytesAndKiloBytes(0);

    }

    public static int printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {

            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
        return kiloBytes;
    }
}