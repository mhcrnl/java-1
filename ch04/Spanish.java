/*
 * Spanish.java
 */

/**
 * Spanishクラスです。
 */
public class Spanish {
        /**
         * mainメソッドです。
         *
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                String spanish = new String();
                if(args.length != 1) {
                        System.out.println("引数の数が不正です。");
                        System.exit(1);
                } else if(args[0].equals("One")) {
                        spanish = "Uno";
                } else if(args[0].equals("Two")) {
                        spanish = "Dos";
                } else if(args[0].equals("Three")) {
                        spanish = "Tres";
                } else if(args[0].equals("Four")) {
                        spanish = "Quatro";
                } else if(args[0].equals("Five")) {
                        spanish = "Cinco";
                } else {
                        System.out.println("引数が不正です。");
                        System.exit(1);
                }
                System.out.println(spanish);
        }
}
