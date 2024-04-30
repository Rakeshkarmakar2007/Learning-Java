import java.util.ArrayList;

public class ArrayToList {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,5,3,8,9,3,5};
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i=0; i < arr1.length-1; i++){
            arr2.add(arr1[i]);

        }
        for(int i: arr2){
            System.out.println(i);
        }
    }
}
