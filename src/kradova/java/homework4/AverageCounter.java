package homework4;

import java.util.Arrays;

public class AverageCounter {
    private final int[] arr;

    public AverageCounter(int[] arr) {
        this.arr = arr;
    }

    public double getAverage() {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        double avg = sum / arr.length;

        return avg;
    }
}
