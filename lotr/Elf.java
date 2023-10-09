package lotr;

import kick.Cry;
// import lombok.ToString;

public class Elf extends Character {
    
    public Elf() {
        super(10, 10, new Cry());
    }

    @Override
    public void kick(Character opponent) {
        if (opponent.getPower() < this.getPower()) {
            opponent.setHp(0);
        } else {
            opponent.setPower(opponent.getPower() - 1);
        }
    }
}


