/*
 * Monsters.java
 */

/**
 * Monsterクラスです。
 */
abstract class Monster {
        
}

/**
 * Vampireクラスです。
 */
class Vampire extends Monster{
}

/**
 * Warewolfクラスです。
 */
class Warewolf extends Monster{

}

/**
 * Zombieクラスです。
 */
class Zombie extends Monster{
}

/**
 * Monstersクラスです。
 */
public class Monsters {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Monster[] m = new Monster[6];
                m[0] = new Vampire();
                m[1] = new Vampire();
                m[2] = new Warewolf();
                m[3] = new Warewolf();
                m[4] = new Zombie();
                m[5] = new Zombie();
                for(int i = 0, l = m.length; i < l; ++i) {
                        System.out.println(m[i].getClass().getName());
                }
        }
}
