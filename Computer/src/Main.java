
abstract class Computer{
    String Model; String ramDetails;
    String StorageDetails; String ProcessorDetails;
    static int serialNumber = 0;


    abstract void processor();
    abstract void Ram();
    abstract void storage();
    void model(){

    }
}
class Desktop extends Computer{
    void processor(){

    }
    void Ram(){

    }
    void storage(){

    }
    void model(){
        System.out.println("--------------------------------------------------------------------------------------------------\nMethod Overwrite");

        System.out.println("\n------------------------------------------------------------------------------------------------ ");
    }

}
class Laptop extends Computer{
    void processor(){

    }
    void Ram(){

    }
    void storage(){

    }
    void model(){
        System.out.println("--------------------------------------------------------------------------------------------------\nMethod Overwrite");

        System.out.println("\n------------------------------------------------------------------------------------------------ ");
    }

    class Test{
        public static void main(String[] args){
            Computer D = new Desktop();
            Laptop L = new Laptop();
            D.storage();
            L.model();


        }
    }


}
