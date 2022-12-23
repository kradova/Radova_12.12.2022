package homework3;

public class Main {
    public static void main(String[] args) {

        NumberChecker numChecker = new NumberChecker();
        //Check even number
        numChecker.checkOddEven(4);
        //Check odd number
        numChecker.checkOddEven(5);

        MonthNameDeclarer monthDeclarer = new MonthNameDeclarer();
        monthDeclarer.printMonthInWordIfElse(2);
        monthDeclarer.printMonthInWordIfElse(5);
        monthDeclarer.printMonthInWordIfElse(7);
        monthDeclarer.printMonthInWordIfElse(44);

        monthDeclarer.printMonthInWordSwitch(1);
        monthDeclarer.printMonthInWordSwitch(4);
        monthDeclarer.printMonthInWordSwitch(6);
        monthDeclarer.printMonthInWordSwitch(55);
    }
}
