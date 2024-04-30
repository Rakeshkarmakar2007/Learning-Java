import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isprime = new boolean[n+1];
        for(int i=0; i <= n; i++){
            isprime[i] = true;
        }
        isprime[0] = isprime[1] = false;

        for(int i = 2; i*i < n; i++){
            if(isprime[i]) {
                for (int j = i*i; j < n; j += i) {
                    isprime[j] = false;
                }
            }
        }

        for(int i = 0; i <= n; i++){
            if(isprime[i]){
                System.out.print(i+", ");
            }
        }
    }
}
