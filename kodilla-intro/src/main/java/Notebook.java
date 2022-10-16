public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This device is light.");
        } else if (this.weight > 700 && this.weight <= 1800) {
            System.out.println("This device is not very heavy");
        } else {
            System.out.println("This device is very heavy.");
        }
    }

    public void checkYearPrice() {
        if ((this.price < 600) && (this.year < 2018)) {
            System.out.println("It's a lost artifact of the ancient world.");
        } else if ((this.price > 600 && this.price <= 1000) && (this.year >= 2018)) {
            System.out.println("It's a sensible choice.");
        } else if ((this.price > 1000) && (this.year < 2018)) {
            System.out.println("It's a scam.");
        }

    }
}