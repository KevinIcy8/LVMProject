import java.util.ArrayList;
public class VG extends LVM{

private ArrayList<PV> pvs = new ArrayList<>();
    public VG(String name, PV pv){
        super(name);
        pvs.add(pv);
    }

    public void addPV(PV pv){
        pvs.add(pv);
    }
    public int totalSpace(){
        return 0;
    }
    public int availableSpace(){
        return 0;
    }
}
