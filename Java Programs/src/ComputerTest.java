abstract class Computer{
    protected String Model; protected String ram;
    protected String Storage; protected String Processor;
    protected String serialNumber;

    private Computer(){}
    Computer(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getModel() {return Model;}
    public String getRam() {return ram;}
    public String getStorage() {return Storage;}

    public String getProcessor() {return Processor;}
    public String getSerialNumber() {return serialNumber;}

    public void setModel(String model) {Model = model;}
    public void setRamDetails(String ramDetails) {this.ram = ramDetails;}
    public void setStorageDetails(String storageDetails) {Storage = storageDetails;}
    public void setProcessorDetails(String processorDetails) {Processor = processorDetails;}

    public void display(){
        System.out.println("----------------------------------------------------------------------------\nSerial No.: "+serialNumber+"\nModel: "+Model+"\nRam: "+ram+"\nStorage: "+Storage+"\nProcessor: "+Processor+"\n----------------------------------------------------------------------------\n");
    }

    abstract void processor();
    abstract void Ram();
    abstract void storage();
    void model(){
    }
}
class Desktop extends Computer{
    Desktop(String serialNumber){
    super(serialNumber);
    }

    void processor(){
        setProcessorDetails("Intel® Core™ i7-1255UL Processor\n" + "12M Cache, up to 4.70 GHz");
    }
    void Ram(){
        setRamDetails("16GB - DDR4");
    }
    void storage(){
        setStorageDetails("Type : HDD  -  Capacity : 1TB");
    }
    void model(String model){
        System.out.println("------------------------------------------\nMethod Overwrite");
        setModel(model);
        System.out.println("\n------------------------------------------- ");
    }
}
class Laptop extends Computer{
    Laptop(String SerialNumber){
        super(SerialNumber);
    }
    void processor(){
        setProcessorDetails("Intel® Core™ i3-1115G4 Processor\n" + "6M Cache, up to 4.10 GHz");
    }
    void Ram(){
        setRamDetails("8GB - DDR4");
    }
    void storage(){
        setStorageDetails("Type : SSD    Capacity : 512GB");
    }
    void model(String model){
        System.out.println("---------------------------------------\nMethod Overwrite");
        setModel(model);
        System.out.println("-------------------------------------------- ");
    }
}
public class ComputerTest {
    public static void main(String[] args){
        Computer D = new Desktop("RX45GD4J2J4LHG863HGY6JHH");
        Laptop   L = new Laptop ("775GVS6BEJ6NND8J8N8JFHX8");
        L.model("hp 250 G8");
        L.processor();
        L.storage();
        L.Ram();
        L.display();

        D.model();
        D.processor();
        D.Ram();
        D.storage();
        D.display();
        System.out.println(L.getModel());
    }
}



