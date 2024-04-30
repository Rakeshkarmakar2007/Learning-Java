import java.util.Arrays;
import java.util.Scanner;
public class DublicateString {
    public static void main(String[] args){
        boolean[] hasMatch = new boolean[258756755];
        Arrays.fill(hasMatch, true);
        String Name;
        String lStr = "";
        Scanner sc = new Scanner(System.in);
        Name = sc.nextLine();

        int left = 0, right = Name.length();
        while(right>left){
            if(hasMatch[Name.charAt(left)]) {
                lStr += Name.charAt(left);
                hasMatch[Name.charAt(left)] = false;
            }
            left++;
        }
        Name = lStr;
        System.out.println(Name);
    }
}
