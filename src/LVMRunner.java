import java.util.ArrayList;
import java.util.Scanner;
public class LVMRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the LVM System");
        String command = "";
        ArrayList<HardDrive> hardrive = new ArrayList<>(); //temporary measures
        ArrayList<PV> pvs = new ArrayList<>();
        ArrayList<VG> vgs = new ArrayList<>();

        while(!command.equals("exit")){
            System.out.print("cmd#: ");
            command = s.nextLine();
            if(command.contains("install-drive")){
                String[] driveList = command.split(" ");
                HardDrive hd = new HardDrive(driveList[1], driveList[2]);
                hardrive.add(hd);
                System.out.println("Drive " + hd.getName() + " installed");
            }
            else if(command.equals("list-drives")){
                for(int i = 0; i < hardrive.size(); i++){
                    System.out.println(hardrive.get(i).toString());
                }
            }
            else if(command.contains("pvcreate")){
                String[] pvList = command.split(" ");
                System.out.println(SystemChecker.driveExists(hardrive, pvList, pvs));
            }
            else if(command.equals("pvlist")){
                for(int i = 0; i < pvs.size(); i++){
                    System.out.println(pvs.get(i).toString());
                }
            }
            else if(command.contains("vgcreate")){
                String[] vgList = command.split(" ");
                System.out.println(SystemChecker.pvExists(pvs,vgList,vgs));
            }
            else if(command.contains("vgextend")){
                String[] vgList = command.split(" ");
                System.out.println(SystemChecker.pvExtend(pvs,vgList,vgs));
            }
            else if(command.equals("vglist")){
                for(int i = 0; i < vgs.size(); i++) {
                    System.out.println(vgs.get(i).toString());
                }
            }
        }
    }
}
