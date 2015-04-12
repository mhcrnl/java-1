/*
 * SuperClass.java
 */

/**
 * SuperClassクラスです。
 */
public class SuperClass {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                try {
                        System.out.println(classNum(args[0]));
                }        
                catch (ClassNotFoundException e) {
                        System.out.println(e);
                }
        }

        /**
         * スーパークラスの数を数えます。
         * @param s 完全修飾クラス名
         * @throws ClassNotFoundException クラスが見つからない
         * @return スーパークラスの数
         */
        public static int classNum(String s) throws ClassNotFoundException{
                int num = 0;
                Class cls = Class.forName(s);
                while(true) {
                        cls = cls.getSuperclass();
                        if (cls == null) {
                                break;
                        }
                        ++num;
                }
                return num;
        }
}
