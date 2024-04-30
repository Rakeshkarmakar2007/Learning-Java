public class Main{
    public static void main(String[] args){
        Human h = new Human(2, 2);
        h.setName("Michael Faraday");
        System.out.println(h.getName());
        h.sleep();
        h.walk();
        Dog d = new Dog(20,90);
        d.move();
    }
}