/*
 * MakeRock.java
 */

/**
 * Rockクラスです。
 */
class Rock {
        /**
         * 岩石の重さ
         */
        double weight;

        /**
         * コンストラクタです。
         */
        Rock() {
              this.weight = Math.random() * 10;
              if(this.weight < 1) {
                      this.weight += 1;
              }
        }
}

/**
 * MakeRockクラスです。
 */
public class MakeRock {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Rock[] r = new Rock[10];
                double sum = 0;
                for(int i = 0; i < 10; ++i) {
                        r[i] = new Rock();
                        sum += r[i].weight;
                        System.out.println(r[i].weight + " kg");
                }
                System.out.println("sum: " + sum + " kg");
        }
}
