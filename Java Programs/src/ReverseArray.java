public class ReverseArray {
    public static  void main(String[] args){
        int[] arr = new int[]{1, 3, 5, 6, 7, 8};
        int len = arr.length - 1;
        int last = len;
        int start = 0, i = 0;
        while(last > start){
            arr[last] += arr[start];
            arr[start] = arr[last] - arr[start];
            arr[last] -= arr[start];
            start += 1; last -= 1;
        }
        while(i!=len+1) {
            System.out.println(arr[i]);
            i += 1;
        }
    }
}
