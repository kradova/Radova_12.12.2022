package homework3;

public class NumberComparer {
    public void compareNumbers(int numberOne, int numberTwo){
        if (Math.abs(numberOne) > Math.abs(numberTwo)){
            System.out.println(numberOne + " has a large magnitude");
        }else if (Math.abs(numberOne) < Math.abs(numberTwo)){
            System.out.println(numberTwo + " has a large magnitude");
        }else {
            System.out.println("Numbers are equal");
        }
    }
}
