package lotr;

public class GameManager {
    static void fight(Character c1, Character c2) {
        System.out.println("Fight begins!");
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Character 1 attacks Character 2:");
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println("Character 2 has been defeated. Character 1 wins!");
                break;
            }

            System.out.println("Character 2 attacks Character 1:");
            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println("Character 1 has been defeated. Character 2 wins!");
                break;
            }

            System.out.println("Character 1 HP: " + c1.hp);
            System.out.println("Character 2 HP: " + c2.hp);
            // System.out.println();
        }
    }
    public static void main(String[] args){
        CharacterFactory characterFactory = new CharacterFactory();
        Character character1 = characterFactory.createCharacter();
        Character character2 = characterFactory.createCharacter();

        System.out.println("Character1 " + character1.getClass().getSimpleName());
        System.out.println("Character2 " + character2.getClass().getSimpleName());

        fight(character1, character2);
    }
}


