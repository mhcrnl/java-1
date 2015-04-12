/*
 * Airplanes.java
 */

/**
 * Airplaneクラスです。
 */
abstract class Airplane {
        /**
         * 乗客数
         */
        int passenger;

        /**
         * シリアル番号
         */
        String serial;

        /**
         * 航空機の機種・シリアル番号・乗客数を示す文字列を返します。
         * @return 航空機の機種・シリアル番号・乗客数を示す文字列
         */
        public String toString() {
                return getClass().getName() + "; " + serial + "; " + passenger;
        }
}

/**
 * B747クラスです。
 */
class B747 extends Airplane{
        /**
         * コンストラクタです。
         */
        B747() {
                passenger = 400;
                serial = "ABC";
        }
}

/**
 * B757クラスです。
 */
class B757 extends Airplane{
        /**
         * コンストラクタです。
         */
        B757() {
                passenger = 500;
                serial = "DEF";
        }
}

/**
 * B767クラスです。
 */
class B767 extends Airplane{
        /**
         * コンストラクタです。
         */
        B767() {
                passenger = 600;
                serial = "GHI";
        }
}


/**
 * Airplanesクラスです。
 */
public class Airplanes {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                B747 b4 = new B747();
                B757 b5 = new B757();
                B767 b6 = new B767();
                System.out.println(b4.toString());
                System.out.println(b5.toString());
                System.out.println(b6.toString());
        }
}
