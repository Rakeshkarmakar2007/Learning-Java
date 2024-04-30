public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 2, -3, 2, -8, 3, 4, 5, -6};
        int k = 2;
        int sum = 0, j, big, i=0;

        for (j = 0; j < k; j++) {
            sum += arr[j];
        }
        big = sum;

        for ( ; j < arr.length; i++, j++) {

            sum += arr[j];
            sum -= arr[i];

            if (big < sum) {
                big = sum;
            }
        }
        System.out.println(big);
    }
}


//"Tech you Forward"