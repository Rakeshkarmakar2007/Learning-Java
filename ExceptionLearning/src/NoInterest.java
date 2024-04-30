public class NoInterest {
    public static void main(String args[]){
        int i=0;
        try {
            try {
                System.out.println(3+9);
                int A = 0 / 0;
            } catch (Exception e) {
                System.out.println(e);
            }
           int a[] = new int[]{6, 78, 9 , 4, 5, 6, 60};
            for(i =0; i<90; i++){
                System.out.println(a[i]);
            }
        }catch(Exception v){

        }finally {
            System.out.println("--------------------------------------------------------------\n"+i);
        }

    }
}
