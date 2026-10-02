import java.util.Arrays;

public class MaximumFinder {

    public int findMaxByLoop(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public int findMaxBySort(int[] numbers) {
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);

        return copy[copy.length - 1];
    }
}
