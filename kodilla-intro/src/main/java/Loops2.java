public class Loops2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{96, 70, 87, 34, 91};
        System.out.println("Tablica składa się z następujących elementów: ");

        int numberOfElements = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Dodawanie do siebie elementów tablicy:");
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
            System.out.println(result);
        }

        System.out.println();
        System.out.println("Suma elementów w tablicy to: " + result);

    }


}