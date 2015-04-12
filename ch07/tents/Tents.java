/*
 * Tents.java
 */

package tents;

/**
 * Waterproof（防水）クラスです。
 */
interface Waterproof {
}

/**
 * Tentクラスです。
 */
abstract class Tent {
        public String toString() {
                return getClass().getName();
        }
}

/**
 * TentAクラスです。
 */
final class TentA extends Tent{
}

/**
 * TentBクラスです。
 */
final class TentB extends Tent implements Waterproof {
}

/**
 * TentCクラスです。
 */
final class TentC extends Tent {
}

/**
 * TentDクラスです。
 */
final class TentD extends Tent implements Waterproof{
}

/**
 * Tentsクラスです。
 */
public class Tents {
        /**
         * テントの数
         */
        private static final int TENT_NUM = 4;

        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Tent[] t = new Tent[TENT_NUM];
                t[0] = new TentA();
                t[1] = new TentB();
                t[2] = new TentC();
                t[3] = new TentD();

                for(int i = 0; i < TENT_NUM; ++i) {
                        if(t[i] instanceof Waterproof) {
                                System.out.println(t[i]);
                        }
                }
        }
}
