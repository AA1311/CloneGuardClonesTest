public class AverageCalculator {

    public double average(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return (double) total / numbers.length;
    }

    public double averageSafe(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return (double) total / numbers.length;
    }
}
