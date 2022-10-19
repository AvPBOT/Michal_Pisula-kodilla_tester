public class Grades {
    private int[] grades;
    private int size;
    double gradeAverage;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
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
        return this.grades[grades.length-1];
    }
    public double avg() {
        if(this.size == 0) {
            return 0;
        }
        double sum = 0;
        for (int value:grades) {
            sum = sum + value;
        }
        this.gradeAverage = sum / this.size;
        return this.gradeAverage;
    }

    public static void main(String[] args) {

Grades.add();
Grades.returnLast();
Grades.avg();

    }
}