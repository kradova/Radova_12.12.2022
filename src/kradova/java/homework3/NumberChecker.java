package homework3;

public class NumberChecker {

    public void checkOddEven(int number) {
        if ( isEven(number)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
