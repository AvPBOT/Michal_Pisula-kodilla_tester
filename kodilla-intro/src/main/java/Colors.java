import java.util.Scanner;
public class Colors {
    public static String getFirstLetter() {
        String nameColor = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first letter of the color name: ");
            String firstLetter = scanner.nextLine().trim();
            switch (firstLetter) {
                case "r":
                    nameColor = ("The color is: red!");
                    System.out.println(nameColor);
                    break;
                case "g":
                    nameColor = ("The color is: green!");
                    System.out.println(nameColor);
                    break;
                case "b":
                    nameColor = ("The color is: blue!");
                    System.out.println(nameColor);
                    break;
                default:
                    System.out.println("I have no idea!");
                    break;
            }
            return nameColor;
        }
    }

    public static void main(String[] args) {

        Colors.getFirstLetter();

    }
}