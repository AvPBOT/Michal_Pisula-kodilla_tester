package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.sub(a,b);
        boolean correctSub = ResultChecker.assertEquals(-3, subResult);
        if(correctSub) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        }
        else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int sqResult = calculator.sq(a);
        boolean correctSquare = ResultChecker.assertEquals(25, sqResult);
        if(correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        }
        else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }
}