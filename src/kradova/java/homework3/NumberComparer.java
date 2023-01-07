package homework3;

public class NumberComparer {
    public void compareNumbers(int numberOne, int numberTwo){
        System.out.println(checkMagnitude(numberOne, numberTwo));
    }

    public String checkMagnitude(int numberOne, int numberTwo){
        if (Math.abs(numberOne) > Math.abs(numberTwo)){
            return numberOne + " has a large magnitude";
        }else if (Math.abs(numberOne) < Math.abs(numberTwo)){
            return numberTwo + " has a large magnitude";
        }else {
            return "Numbers are equal";
        }
    }
}
