package homework4;

public class DegreeChart {
    public void degreeIncrease() {
        for (int i = 0; i <= 360; i += 10) {
            System.out.println("sin "+i + " degree = " + Math.sin(i));
        }
    }
}
