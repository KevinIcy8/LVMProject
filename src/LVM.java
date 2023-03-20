import java.util.UUID;
public class LVM {
    private String name;
    private UUID randomUUID;

    public LVM(String n) {
        name = n;
        randomUUID = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getRandomUUID() {
        return randomUUID;
    }
}
