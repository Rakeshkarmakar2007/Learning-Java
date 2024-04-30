class solution {
    public static void main(String[] args){
        String s ="Marge, let's \"[went].\" I await {news} telegram.";
        s= s.toLowerCase();

        s= s.toLowerCase();
        int right=s.length()-1, left=0;
        while(left<right){
            while(((s.charAt(left)<97 && s.charAt(left)>122) ||(s.charAt(left)<48 && s.charAt(left)>57 ))){
                left++;
            }
            while(((s.charAt(right)<97 && s.charAt(right)>122) ||(s.charAt(right)<48 && s.charAt(right)>57 ))){
                right--;
            }
            System.out.println(s.charAt(right)+"-----"+s.charAt(left));
        }

    }
}