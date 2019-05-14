import java.util.ArrayList;
import java.util.List;
class Digit{
    public static List<Integer> getDigits(String number) {
        String[] userInput = number.split("");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=userInput.length;
        while(i>0){
            list.add(Integer.valueOf(userInput[i-1]));
            i--;
        }
        return list;
    }
}