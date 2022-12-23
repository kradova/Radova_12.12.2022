package homework3;

public class IsoscelesTriangle {
    public void isTriangleIsoscrles(int a, int b, int c){
        if(a == b || b == c || c == a){
            System.out.println("Triangle is Isoscrles");
        }else{
            System.out.println("Triangle is not Isoscrles");
        }
    }
}
