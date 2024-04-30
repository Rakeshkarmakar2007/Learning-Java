class Parent {
    Parent(int a, int b){
        System.out.println("sum is : "+ (a+b));
    }
    void java(){
        System.out.println("Brati");
    }
}
class Child extends Parent{
    void java(){
        System.out.println("Rakesh");
    }
    Child(int ag, int vg){
        super(ag,vg);
        super.java();
    }
}
public class Inherttance {
    public static void main(String[] args){
        Child c = new Child(10, 20);
        c.java();
    }
}
