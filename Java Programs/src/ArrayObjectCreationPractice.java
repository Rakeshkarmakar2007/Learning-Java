class Rakesh{
    private final String MotherName = "Sabita Karmakar";
    private int age = 17; private double percentageMarks = 64.7;
    private String Department = "CST";

    public String getMotherName() {
        return MotherName;
    }
    public int getAge() {
        return age;
    }
    public double getPercentageMarks() {
        return percentageMarks;
    }
    public String getDepartment() {
        return Department;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public void setPercentageMarks(double percentageMarks) {this.percentageMarks = percentageMarks;}
    public void setDepartment(String department) {
        Department = department;
    }

    void display(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println(MotherName);
        System.out.println(age);
        System.out.println(percentageMarks);
        System.out.println(Department);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
}

public class ArrayObjectCreationPractice {
    public static void main(String[] args){
        int n = 4;
        Rakesh[] r = new Rakesh[n];
        for(int i=0; i < n; i++){
            r[i] = new Rakesh();
        }

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(r[1].getAge());
        System.out.println(r[2].getPercentageMarks());
        System.out.println(r[3].getMotherName());
        System.out.println(r[2].getDepartment());
        System.out.println("--------------------------------------------------------------------------------------------");

        r[1].setAge(16);
        r[2].setDepartment("EEE");
        r[3].setPercentageMarks(70.1);

        r[1].display();
        r[2].display();
        r[3].display();
    }
}
