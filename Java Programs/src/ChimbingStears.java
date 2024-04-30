import java.util.Arrays;

public class ChimbingStears {
    public static void main(String[] args){
        int[] match = new int[46];
        Arrays.fill(match, -1);
        System.out.println(chimbingStears(45, match));
    }
    static int chimbingStears(int n, int[] match){

        if(n==0 || n==1){
            return 1;
        }
        if(match[n] == -1) {
            match[n] = chimbingStears(n - 1, match) + chimbingStears(n - 2, match);
        }else{
            return match[n];
        }
       return match[n];

    }

}
