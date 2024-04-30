import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Find prime Number from:");
        int a = sc.nextInt();
        System.out.print("Find prime number to :");
        int b = sc.nextInt();
        boolean c = false;
        for(int j = a; j < b; j++ ) {
            c= false;
            if(j <= 1){ c = true;}
            else {
                for (int i = 2; i < j; i++) {
                    if (j % i == 0) {
                        c = true;
                        break;
                    }
                }

            }
            if(!c){
                System.out.print(j +", ");
            }

        }
    }
}
