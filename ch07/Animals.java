/*
 * Animals.java
 */

/**
 * Animalクラスです。
 */
abstract class Animal {
        public String toString() {
                return getClass().getName();
        }
}

/**
 * Bird（鳥類）クラスです。
 */
abstract class Bird extends Animal {
}

/**
 * Reptile（爬虫類）クラスです。
 */
abstract class Reptile extends Animal implements ColdBlooded {
}

/**
 * Dove（鳩）クラスです。
 */
class Dove extends Bird {
}

/**
 * Eagleクラスです。
 */
class Eagle extends Bird {
}

/**
 * Hawkクラスです。
 */
class Hawk extends Bird {
}

/**
 * Penguinクラスです。
 */
class Penguin extends Bird implements OceanDwelling {
}

/**
 * Seagull（カモメ）クラスです。
 */
class Seagull extends Bird implements OceanDwelling {
}

/**
 * Rattlesnake（ガラガラヘビ）クラスです。
 */
class Rattlesnake extends Reptile {
}

/**
 * Turtleクラスです。
 */
class Turtle extends Reptile implements OceanDwelling {
}

/**
 * ColdBlooded（冷血動物）インターフェイスです。
 */
interface ColdBlooded {
}

/**
 * OcenDwelling（海棲動物）インターフェイスです。
 */
interface OceanDwelling {
}

/**
 * Animalsクラスです。
 */
public class Animals {
        /**
         * 動物の数
         */
        private static final int ANIMAL_NUM = 7;
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Animal[] a = new Animal[ANIMAL_NUM];
                a[0] = new Dove();     
                a[1] = new Eagle();
                a[2] = new Hawk();
                a[3] = new Penguin();
                a[4] = new Seagull();
                a[5] = new Rattlesnake();
                a[6] = new Turtle();

                System.out.print("ColdBlooded: ");
                for(int i = 0; i < ANIMAL_NUM; ++i) {
                        if(a[i] instanceof ColdBlooded) {
                                System.out.print(a[i] + " ");
                        }
                }

                System.out.print("\nOceanDwelling: ");
                for(int i = 0; i < ANIMAL_NUM; ++i) {
                        if(a[i] instanceof OceanDwelling) {
                                System.out.print(a[i] + " ");
                        }
                }
                System.out.println();
        }
}
