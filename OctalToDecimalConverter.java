import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {
    public static void main(String[] args) {
        String octal = args[0];
        if(isNotOctal(octal)){
            System.out.println("your input is not an octal number");
            return;
        }
        int octalNumber = Integer.parseInt(args[0]);
        int i=0,decimalNumber=0,lastDigit,exponent=8;
        boolean notDecimal = true;
        while(octalNumber!=0) {
            lastDigit = getLastDigit(octalNumber);
            octalNumber= getOctalNumber(octalNumber);
            decimalNumber+=lastDigit * ((int)(Math.pow(exponent,i)));
                i++;
        }
        System.out.println("The decimal number of the number you have given is "+decimalNumber);
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

    private  static List<Integer> getDigits(int number){
        List<Integer> digits = new ArrayList<Integer>();
        while(number!=0){
            digits.add(getLastDigit(number));
            number = getOctalNumber(number);
        }
        return digits;
    }
}
