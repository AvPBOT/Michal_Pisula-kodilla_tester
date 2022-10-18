import java.util.Random;

public class RandomNumbers {

    private int[] randomNumbers;
    private int sum;
    private int min;
    private int max;


    public RandomNumbers() {
        this.randomNumbers = new int[5000];
    }

    public void generateNumbers() {
        for (int i = 0; i < 1; i++) {
            Random rnd = new Random();
            randomNumbers[i] = rnd.nextInt(31);
            sum = sum + randomNumbers[i];
        }
    }

    public void sumGoal() {
        if (sum == 5000) {
            return;
        }
        while(sum < 5000) {
            this.generateNumbers();
        }
    }

    public int minimalValue() {
        min = randomNumbers[0];
        for (int i=0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < min) {
                min = randomNumbers[i];
            }
        }
        return min;
    }

    public int maximalValue() {
        max = randomNumbers[0];
        for (int i=0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers rng = new RandomNumbers();
        rng.generateNumbers();
        rng.sumGoal();
        System.out.println(" ");
        System.out.println("Minimalna wylosowana: " + rng.minimalValue());
        System.out.println("Maksymalna wylosowana: " + rng.maximalValue());
    }
}