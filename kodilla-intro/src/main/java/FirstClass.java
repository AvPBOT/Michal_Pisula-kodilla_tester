public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello from FirstClass!");

        if (1 > 2){
            System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
        }

        String example = sayHello();
        System.out.println(example);

    }
    private static String sayHello() {
        String text = "Hello from FirstClass!";

        return text;
    }
}