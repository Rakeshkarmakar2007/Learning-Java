import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Friday {
    public static void main(String[] args) {
        String[] details = new String[5];
        Scanner sc = new Scanner(System.in);
        int c = 1;
        DateTimeFormatter formatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm");
        LocalDateTime Datetime = LocalDateTime.now();
        String dateTime = Datetime.format(formatobj);

        try{
            FileWriter f = new FileWriter("C:\\Users\\karma\\OneDrive\\Desktop\\"+dateTime+".csb");
            f.write("Name,Last_Name,Roll,Phone_no,Department");
            while(c == 1) {
                System.out.println("Enter the student details Name, Last_Name, Roll, Phone_no, Department respectively:");
                for (int i = 0; i < 5; i++) {
                    details[i] = sc.next();
                }
                f.append(details[0] + "," + details[1] + "," + details[2] + "," + details[3] + "," + details[4]+"\n");

                System.out.println("Enter 1 to Continue:");
                c = sc.nextInt();
            }
            f.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}