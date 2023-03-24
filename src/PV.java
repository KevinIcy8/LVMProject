public class PV extends LVM{
    private HardDrive correspDrive;
    public PV(String name, HardDrive driveName){
        super(name);
        correspDrive = driveName;
    }
    public int getSize(){
        return Integer.parseInt(correspDrive.getSize());
    }

    public String toString(){
        return super.getName() + ": " + "[" + correspDrive.getSize() + "] [" + super.getRandomUUID() + "]";
    }
}
