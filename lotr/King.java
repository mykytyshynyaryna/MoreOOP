package lotr;

import java.util.Random;

import kick.KickStrategy;

class King extends Character {
    private static KickStrategy kickStrategy;

    King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5, kickStrategy);
    }

    @Override
    public
    void kick(Character opponent) {
        int damage = new Random().nextInt(getPower()) + 1;
        System.out.println("King kicks with power " + damage);
        opponent.setHp(opponent.getHp() - damage);
    }
}







// public class King extends Character {
//     private static KickStrategy kickStrategy;
//     private int power;
//     private int hp;
    

//     public int getHp() {
//         return hp;
//     }

//     public void setHp(int hp) {
//         this.hp = hp;
//     }

//     public int getPower() {
//         return power;
//     }

//     public void setPower(int power) {
//         this.power = power;
//     }

//     public King() {
//         super(0, 0, kickStrategy);
//         Random random = new Random();
//         this.power = random.nextInt(11) + 5;
//         this.hp = random.nextInt(11) + 5;
//     }
    
//     public void kick(Character opponent) {
//         int damage = new Random().nextInt(this.power) + 1;
//         int enemyHp = opponent.getHp();
//         if (damage >= enemyHp) {
//             opponent.setHp(0);
//         } else {
//             opponent.setHp(enemyHp - damage);
//         }
//     }
// }
