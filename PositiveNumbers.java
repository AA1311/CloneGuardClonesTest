public class PositiveNumbers {

    public int countPositive(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }

        return count;
    }

    public int countPositiveWithMinimum(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }

        if (count < 5) {
            return 0;
        }

        return count;
    }
}
