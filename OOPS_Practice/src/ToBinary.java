import java.util.ArrayList;
import java.util.Scanner;
public class ToBinary {
    public  static void main(String[] args){
        String binVal = "";
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int fraction;
        while(num != 0){
            fraction = num % 2;
            num /= 2;
            binVal += fraction;
        }
        for(int i = binVal.length()-1; i >= 0; i--) {
            System.out.print(binVal.charAt(i));
            ArrayList<Integer> arr = new ArrayList<Integer>();
        }
    }
}
