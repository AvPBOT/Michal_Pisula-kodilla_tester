import java.util.Random;

public class RandomNumbers {

    private static final Random random = new Random();

    private int min = 31;
    private int max = -1;

    public void generateNumbers() {
        int sum = 0;
        int number;
        while (sum < 5000) {
                number = random.nextInt(31);
                sum += number;
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers rng = new RandomNumbers();
        rng.generateNumbers();
        System.out.println();
        System.out.println("Najmniejsza wylosowana wartość to: " + rng.getMin());
        System.out.println("Największa wylosowana wartość to: " + rng.getMax());
    }
}