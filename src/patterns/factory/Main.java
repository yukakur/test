package patterns.factory;

public class Main {
    public static void main(String[] args) {
        try {
            GamePerson Elf1 = PersonFactory.createPerson(PersonType.ELV);
            GamePerson Warrior = PersonFactory.createPerson(PersonType.UNKNOWN);
        } catch (GameException e) {
            System.out.println(e);
        }
    }
}
