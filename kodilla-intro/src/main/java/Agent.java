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

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean olderThan() {
        if(getAge() > 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean higherThan() {
        if(getHeight() > 160) {
            return true;
        } else {
            return false;
        }
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