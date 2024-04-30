import java.util.Scanner;

class Camera{
    Camera(){
    }
    Camera(String name, String registration){
        System.out.println(name);
        System.out.println(registration);
    }
}


public class ObjectPracticeArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Camera[] CameraArray = new Camera[10];


        for(int i = 0; i < 10; i++){
            System.out.println("Enter Name: ");
            String Name = sc.next();
            System.out.println("Ennter Registration Number: ");
            String Reg = sc.next();
            CameraArray[i] = new Camera(Name, Reg);
        }
    }
}

