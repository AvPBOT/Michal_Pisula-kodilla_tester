public class Agent {

    String name;
    double age;
    double height;

    public Agent(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public boolean hasName() {
        if (this.name == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isOlderThan(double age) {
        return this.age > age;
    }

    public boolean isTallerThan(double height) {
        return this.height > height;
    }

    @Override
    public String toString() {
        return "Agent {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", height = " + height +
                '}';
    }
}