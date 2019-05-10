import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {
    public static void main(String[] args) {
        String octal = args[0];
        int numberOfTerms = octal.length();
        if (isNotOctal(octal)) {
            System.out.println("your input is not an octal number");
            return;
        }
        int i = 0, decimalNumber = 0;
        for (int digit : getDotProducts(getDigits(args[0]), getPowerSereis(numberOfTerms))) {
            decimalNumber += digit;
        }
        System.out.println("The decimal number of the number you have given is " + decimalNumber);
    }
    private static boolean isNotOctal(String octal) {
        return octal.contains("8") || octal.contains("9");
    }

    private static int getOctalNumber(int octalNumber) {
        return octalNumber / 10;
    }

    private static int getLastDigit(int octalNumber) {
        return octalNumber % 10;
    }

    private static List<Integer> getDigits(String number) {
        int num = Integer.parseInt(number);
        List<Integer> digits = new ArrayList<Integer>();
        while (num != 0) {
            int lastDigit = getLastDigit(num);
            num = getOctalNumber(num);
            digits.add(lastDigit);
        }
        return digits;
    }

    private static List<Integer> getPowerSereis(int numberOfTerms) {
        List<Integer> powerSeries = new ArrayList<Integer>();
        int exponent = 8;
        for (int i = 0; i < numberOfTerms; i++) {
            int power = (int) (Math.pow(exponent, i));
            powerSeries.add(power);
        }
        return powerSeries;
    }
    private static List<Integer> getDotProducts(List<Integer> numbers1, List<Integer> numbers2) {
        List<Integer> dotProduct = new ArrayList<Integer>();
        for (int i = 0; i < numbers1.size(); i++) {
            int product = numbers1.get(i) * numbers2.get(i);
            dotProduct.add(product);
        }
        return dotProduct;
    }
}