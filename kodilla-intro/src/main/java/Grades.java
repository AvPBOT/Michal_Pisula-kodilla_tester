public class Grades {
    private int[] grades;
    private int size;
    private double gradeAverage;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void addGrade(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int returnLast() {
        if(this.size == 0) {
            return 0;
        }
        return this.grades[grades.length - 1];
    }

    public double getAverage() {
        if(this.size == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }
        return sum/this.grades.length;
    }

    public static void main(String[] args) {

    }
}