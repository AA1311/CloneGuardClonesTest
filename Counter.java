public class Counter {

    public int countPositive(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }

        return count;
    }

    public int countAboveZero(int[] values) {
        int total = 0;

        for (int value : values) {
            if (value > 0) {
                total++;
            }
        }

        return total;
    }
}
