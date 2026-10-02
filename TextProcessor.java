public class TextProcessor {

    public String reverseWithLoop(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    public String reverseWithBuilder(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
