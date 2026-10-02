public class DataProcessor {

    public int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public int getMaximum(int[] values) {
        int maximum = values[0];

        for (int value : values) {
            if (value > maximum) {
                maximum = value;
            }
        }

        return maximum;
    }
}
