public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        char[] digitsAsChars = String.valueOf(number).toCharArray();
        int power = digitsAsChars.length;
        int narcissisticSum = 0;
        for (char c : digitsAsChars) {
            narcissisticSum += Math.pow(Character.getNumericValue(c),power);
        }
        return narcissisticSum == number;
    }
}