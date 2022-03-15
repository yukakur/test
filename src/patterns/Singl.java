package patterns;

public class Singl {
    private static Singl instance;
    public static Singl getInstance() {
        if(instance == null) {
            instance = new Singl();
        }
            return instance;
    }
    private Singl() {
    }
}
