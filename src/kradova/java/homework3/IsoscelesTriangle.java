package homework3;

public class IsoscelesTriangle {
    public void isTriangleIsoscrles(int a, int b, int c) {
        if (isIsoscrles(a, b, c)) {
            System.out.println("Triangle is Isoscrles");
        } else {
            System.out.println("Triangle is not Isoscrles");
        }
    }//isTriangleIsoscrles

    public boolean isIsoscrles(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            return true;
        } else {
            return false;
        }
    }//isIsoscrles
}
