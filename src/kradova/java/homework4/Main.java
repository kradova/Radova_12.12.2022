package homework4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Task 1-----");
        DegreeChart degree = new DegreeChart();
        degree.degreeIncrease();

        System.out.println("\n-----Task 2-----");
        ArrayChanger arrayChanger = new ArrayChanger();
        int[] randArray = arrayChanger.getRandomArray(10);
        System.out.println("New array before changes:");
        arrayChanger.printArray(randArray);
        randArray = arrayChanger.replaceEvenElements(randArray);
        System.out.println("New array after changes:");
        arrayChanger.printArray(randArray);

        System.out.println("\n-----Task 3-----");
        randArray = arrayChanger.getRandomArray(10);
        AverageCounter avgCounter = new AverageCounter(randArray);
        System.out.println("New random array:");
        arrayChanger.printArray(randArray);
        System.out.println("Average off array:");
        System.out.println(avgCounter.getAverage());
    }
}
