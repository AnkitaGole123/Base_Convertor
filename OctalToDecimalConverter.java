import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {
    public static void main(String[] args) {
        int base = Integer.parseInt(args[1]);
        String number = args[2];
        int numberOfTerms = number.length();
        if (isNotValid(Digit.getDigits(number), base)) {
            System.out.println("your input is not an number number");
            return;
        }
        int decimal= DotProduct.getDotProducts(Digit.getDigits(number),PowerSeries.getPowerSeries(numberOfTerms, base));
        System.out.println("The decimal number of the number you have given is " + decimal);
        }
    private static boolean isNotValid(List<Integer>digits, int base) {
        for (int i = 0; i< digits.size(); i++){
            if (digits.get(i) > base){
                return true;
            }
        }
        return false;
    }
}