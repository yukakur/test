package patterns.factory;

public class Human extends GamePerson {
    private int force;
    private int magic;

    public Human(int force, int magic) {
        this.force = force;
        this.magic = magic;
    }
}
