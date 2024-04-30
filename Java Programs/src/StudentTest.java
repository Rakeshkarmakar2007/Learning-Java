import java.util.Scanner;
class Student{
    private String name, address, phoneNumber;
    private int marks, rollNo; static int counter=0;
    Student(){
        // to stop blank object creation
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getMarks() {
        return marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public static int getCounter() {
        return counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    Student(String n){
        name = n;
        rollNo = ++counter;
    }
    Student(String n,String a){
        this(n);
        address=a;
    }
    Student(String n,String a,String c){
        this(n,a);
        phoneNumber=c;
    }

    void display(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Roll: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Marks: " + marks);
    }
    void update(String add, String number){
        address =add;
        phoneNumber = number;
    }
    String getadd(){
        return address;
    }

}
class StudentTest{
    public static void main(String[] arg){

        Student s = new Student();
        s.setName("brati");
        s.setAddress("Krishnagar");
        s.setMarks(200);
        s.setPhoneNumber("4875687345");
        s.setMarks(600);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println(s.getName());
        System.out.println(s.getAddress());
        System.out.println(s.getPhoneNumber());
        System.out.println(s.getMarks());

    }
}