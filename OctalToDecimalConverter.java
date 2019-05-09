import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {
    public static void main(String[] args) {
        String octal = args[0];
        if(isNotOctal(octal)){
            System.out.println("your input is not an octal number");
            return;
        }
        int i=0,decimalNumber=0,exponent=8;
        for(int digit:getDigits(args[0])) {
            decimalNumber+=digit * ((int)(Math.pow(exponent,i)));
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

    private  static List<Integer> getDigits(String number){
        int num = Integer.parseInt(number);
        List<Integer> digits = new ArrayList<Integer>();
        while(num!=0){
            int lastDigit = getLastDigit(num);
            num =getOctalNumber(num);
                    digits.add(lastDigit);
        }
        return digits;
    }

}
