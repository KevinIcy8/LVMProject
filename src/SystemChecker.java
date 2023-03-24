import java.util.ArrayList;

public class SystemChecker {
    public static String driveExists(ArrayList<HardDrive> hardrive, String[] pvList, ArrayList<PV> pvs){
        for(int i = 0; i < hardrive.size(); i++){
            if(pvList[2].equals(hardrive.get(i).getName())){
                PV pv = new PV(pvList[1], hardrive.get(i));
                pvs.add(pv);
                return pvList[1] + " created";
            }
        }
        return "Drive does not exist";
    }

    public static String pvExists(ArrayList<PV> pvs, String[] vgList, ArrayList<VG> vgs){
        for(int i = 0; i < pvs.size(); i++){
            if(vgList[2].equals(pvs.get(i).getName())){
                VG vg = new VG(vgList[1], pvs.get(i));
                vgs.add(vg);
                return vgs.get(i).getName() + " created";
            }
        }
        return "PV does not exist";
    }

    public static String pvExtend(ArrayList<PV> pvs, String[] vgList, ArrayList<VG> vgs){
        for(int i = 0; i < vgs.size(); i++){
            if(vgList[1].equals(vgs.get(i).getName())){
                for(int j = 0; j < pvs.size(); j++){
                    if(vgList[2].equals(pvs.get(j).getName())){
                        vgs.get(i).addPV(pvs.get(j));
                        return pvs.get(j).getName() + " added to " + vgs.get(i).getName();
                    }
                }
                return "PV does not exist";
            }
        }
        return "VG does not exist";
    }
}
