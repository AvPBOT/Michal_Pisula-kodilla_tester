public class Agent {

    private String name;
    private double age;
    private double height;

    public Agent(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean hasName() {
        return name != null;
    }

    public boolean isOlderThan(double age) {
        return this.age > age;
    }

    public boolean isTallerThan(double height) {
        return this.height > height;
    }
}