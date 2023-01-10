package homework3;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== Task 1 =====");
        NumberChecker numChecker = new NumberChecker();
        //Check even number
        numChecker.checkOddEven(4);
        //Check odd number
        numChecker.checkOddEven(5);

        System.out.println("\n===== Task 2 =====");
        MonthNameDeclarer monthDeclarer = new MonthNameDeclarer();
        monthDeclarer.printMonthInWordIfElse(2);
        monthDeclarer.printMonthInWordIfElse(5);
        monthDeclarer.printMonthInWordIfElse(7);
        monthDeclarer.printMonthInWordIfElse(44);

        monthDeclarer.printMonthInWordSwitch(1);
        monthDeclarer.printMonthInWordSwitch(4);
        monthDeclarer.printMonthInWordSwitch(6);
        monthDeclarer.printMonthInWordSwitch(55);

        System.out.println("\n===== Task 3 =====");
        NumberComparer comparer = new NumberComparer();
        comparer.compareNumbers(3, -9);
        comparer.compareNumbers(7, -5);
        comparer.compareNumbers(4, -4);

        System.out.println("\n===== Task 4 =====");
        IsoscelesTriangle triangleChecker = new IsoscelesTriangle();
        triangleChecker.isTriangleIsoscrles(2, 3, 5);
        triangleChecker.isTriangleIsoscrles(2, 2, 2);
        triangleChecker.isTriangleIsoscrles(5, 7, 5);
    }
}
