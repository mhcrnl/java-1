/*
 * ArrayBond.jaba
 */

/**
 * Bondクラスです。
 */
class Bond {
        /**
         * 文字列を表示します。
         */
        public void display() {
                System.out.println("Bond");
        }
}

/**
 * ConvertibleBondクラスです。
 */
class ConvertibleBond extends Bond{
        /**
         * 文字列を表示します・
         */
        public void display() {
                System.out.println("ConvertibleBond");
        }
}

/**
 * ArrayBondクラスです。
 */
public class ArrayBond {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Bond[] b = new Bond[6];
                for(int i = 0; i < 3; ++i) {
                        b[i] = new Bond();
                }
                for(int i = 3; i < 6; ++i) {
                        b[i] = new ConvertibleBond();
                }
                for(int i = 0, l = b.length; i < l; ++i) {
                        b[i].display();
                }
                
        }
}
