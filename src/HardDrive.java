public class HardDrive extends LVM{
    private String size;
    public HardDrive(String name, String size){
        super(name);
        this.size = size;
    }

    public String toString(){
        return super.getName() + " [" + size + "][" + super.getRandomUUID() + "]";
    }

    public String getSize() {
        return size;
    }
}
