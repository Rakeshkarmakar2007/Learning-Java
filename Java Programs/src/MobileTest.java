abstract class Mobile {
    String Mob = "XIOMI";
    void camera(){
        System.out.println("opeaning camera");
    }
    abstract void call();

}
class Xiomi extends Mobile{
    void camera(){

    }


    void call(){

    }


}
class Vivo extends Mobile{
    void camera(){
         System.out.println(Mob);
    }
    void call(){

    }
}
class MobileTest{
    public static void main(String[] args){
       //Mobile mobile = new Mobile();
        System.out.println();
        Mobile m = new Xiomi();
        Vivo v = new Vivo();
        m.call();
        m.camera();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        v.call();
        v.camera();
    }

}
