public class AverageTool {

    public double calculateAverage(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return (double) total / numbers.length;
    }

    public double computeMean(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return (double) sum / values.length;
    }
}
