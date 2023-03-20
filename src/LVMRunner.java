import java.util.Scanner;
public class LVMRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the LVM System");
        String command = "";
        while(!command.equals("exit")){
            System.out.print("cdm#: ");
            command = s.nextLine();
            if(command.contains("install-drive")){
                String[] commandList = command.split(" ");
                HardDrive hd = new HardDrive(commandList[1], commandList[2]);
                System.out.println(hd.toString());
            }
        }
    }
}
