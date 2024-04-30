public class Mamal implements Animal{
    private int numberOfHands;
    private int numberOfLegs;

    Mamal(int numberOfHands, int numberOfLegs){
        this.numberOfHands = numberOfHands;
        this.numberOfLegs  = numberOfLegs;
    }

    public int getNumberOfHands() {
        return numberOfHands;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }


    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
}

class Human extends Mamal {
    private String name;

    Human(int numberOfHands, int numberOfLegs){
        super(numberOfHands,numberOfLegs);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println(name+" is sleeping..........................");
    }

    void walk() {
        System.out.println(name+" is walking...........................");
    }
}


class Dog extends Mamal{

    Dog(int numberOfHands, int numberOfLegs) {
        super(numberOfHands, numberOfLegs);
    }
    public void move(){
        System.out.println("The dog is mooving..................");
    }

}


