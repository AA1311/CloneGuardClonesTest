public class ValueFinder {

    public int findSmallest(int[] numbers) {
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public int getLowest(int[] values) {
        int lowest = values[0];

        for (int value : values) {
            if (value < lowest) {
                lowest = value;
            }
        }

        return lowest;
    }
}
