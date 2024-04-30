public class SimpleCode {
    public static void main(String[] args){
        String s = "level";
        int len = s.length()-1;
        for(int i=len/2; i >= 0; i--){
            if(s.charAt(len-i) == s.charAt(i)){
                if(i==0) {
                    System.out.println("The number is palindrome");
                }
            }else{
                System.out.println("The number is not palindrome");
                break;
            }
        }
    }
}
