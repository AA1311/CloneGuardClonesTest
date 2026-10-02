import java.util.Arrays;

public class ArraySearch {

    public boolean containsValue(int[] numbers, int target) {
        for (int number : numbers) {
            if (number == target) {
                return true;
            }
        }

        return false;
    }

    public boolean containsValueBinary(int[] numbers, int target) {
        int[] sorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sorted);

        return Arrays.binarySearch(sorted, target) >= 0;
    }
}
