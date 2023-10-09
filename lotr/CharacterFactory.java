package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        List<Class<? extends Character>> characters = Arrays.asList(Hobbit.class, Elf.class, King.class, Knight.class);
        Class<? extends Character> characterClass = characters.get(new Random().nextInt(characters.size()));
        return characterClass.getDeclaredConstructor().newInstance();
    }
}
