import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int rok;
        boolean czyPrzestepny;
        System.out.println("Podaj rok:");
        rok = getInt();

        /*
        rok jest rokiem przestępnym, jeżeli:
        dzieli się przez 4 i nie dzieli się przez 100
        lub
        dzieli się przez 400.
         */

        czyPrzestepny = rok % 4 == 0 && rok % 100 != 0 ? true : false;
        System.out.println("Czy jest przestępny? " + czyPrzestepny);
    }
    public static int getInt() {

        return new Scanner(System.in).nextInt();
    }
}