package patterns.factory;

public class PersonFactory {
    public static GamePerson createPerson(PersonType personType) throws GameException {
        switch (personType) {
            case WARRIOR:
                return new Human(10, 0);
            case MAG:
                return new Human(0, 10);
            case TROLL:
                return new Troll();
            case ELV:
                return new Elv(false);
            case DARK_ELV:
                return new Elv(true);
            default:
                throw new GameException();
        }
    }
}
