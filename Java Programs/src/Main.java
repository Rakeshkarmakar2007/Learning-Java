public class Main {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        int k = 3 ;

        int n = num.length ; // n = 9
        int [] arrS = new int [n-2] ; //n-2 = 7
        int sum = 0 ;

        int j = 0 ;
        int i=0 ;

        while (j != 7){
            for (; i < k ; i++){
                sum += num[i];
            }
            i -= (k - 2) ;
            arrS[j] = sum ;
            k += 1 ;
            sum = 0;
            j++ ;
        }

        for (int x : arrS){
            System.out.println(x);
        }

    }
}