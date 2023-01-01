package homework4;

import java.util.Random;

public class ArrayChanger {

    private static boolean isEven(int number){
        return number % 2 == 0;
    }

    public int[] replaceEvenElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public int[] getRandomArray(int num) {

        int[] arr = new int[num];
        Random randomArr = new Random();

        for (int i = 0; i < num; i++) {
            arr[i] = randomArr.nextInt(100);
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + "; ");
        }
        System.out.println();
    }
}
