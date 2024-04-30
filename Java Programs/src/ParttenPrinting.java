import java.util.Scanner;
public class ParttenPrinting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.print("* ");
            for(int j = 0; j <= 2*n; j++){
                if(i==0 || i==n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("*");
        }


        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i = n -1 ; i >= 0; i--){
            for(int j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }

    }
}


