public class NumberChecker {

    public boolean isEvenModulo(int number) {
        return number % 2 == 0;
    }

    public boolean isEvenBitwise(int number) {
        return (number & 1) == 0;
    }
}
