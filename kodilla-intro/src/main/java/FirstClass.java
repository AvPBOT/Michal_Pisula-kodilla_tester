public class FirstClass {
    public static void main(String[] args) {
        /*
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

        Notebook notebook = new Notebook(600, 1000);
        System.out.println("The weight of the notebook is: " + notebook.weight);
        System.out.println("The price of the notebook is: " + notebook.price);

        Notebook heavyNotebook = new Notebook(2000, 1500);
        System.out.println("The weight of the heavyNotebook is: " + heavyNotebook.weight);
        System.out.println("The price of the heavyNotebook is: " + heavyNotebook.price);

        Notebook oldNotebook = new Notebook(1600, 500);
        System.out.println("The weight of the oldNotebook is: " + oldNotebook.weight);
        System.out.println("The price of the oldNotebook is: " + oldNotebook.price);

        System.out.println();
        System.out.println(notebook.weight + notebook.price);
        System.out.println(notebook.weight + " " + notebook.price);

        System.out.println();
        if (notebook.price < 900){
            System.out.println("This notebook is cheap");
        } else {
            System.out.println("This notebook is quite expensive");
        }
        */
        Notebook notebook = new Notebook(600, 1000, 2018);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2012);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1600, 500, 2005);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();

    }
}