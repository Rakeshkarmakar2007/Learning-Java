public class NoName {
    public static void main(String[] args){
        try {
            login(1);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    static void  login(int age)throws Eror {
        if(age<18){
           throw new Eror("uetrnfufn");
        }else{
            System.out.println("Login Successful");
        }
    }
}




class Eror extends Exception{
    Eror(String Message){
        super(Message);
    }

}
