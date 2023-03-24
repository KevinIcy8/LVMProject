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
        int sum = 0;
        for(int i = 0; i < pvs.size(); i++){
            sum += pvs.get(i).getSize();
        }
        return sum;
    }
    public int availableSpace(){
        return 0;
    }
}
