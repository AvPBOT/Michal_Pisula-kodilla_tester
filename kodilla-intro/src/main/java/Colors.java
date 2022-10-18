import java.util.Scanner;
public class Colors {
    public static String getFirstLetter() {
        String name = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first letter of the color name: ");
            String firstLetter = scanner.nextLine().trim();
            switch (firstLetter) {
                case "r":
                    name = ("The color is: red!");
                    System.out.println(name);
                    break;
                case "g":
                    name = ("The color is: green!");
                    System.out.println(name);
                    break;
                case "b":
                    name = ("The color is: blue!");
                    System.out.println(name);
                    break;
                default:
                    System.out.println("I have no idea!");
                    break;
            }
            return name;
        }
    }

    public static void main(String[] args) {

        Colors.getFirstLetter();

    }
}