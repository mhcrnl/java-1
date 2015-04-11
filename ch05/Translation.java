/*
 * Translation.java
 */

/**
 * Languageクラスです。
 */
class Language {
        /**
         * 英語表記の数字をスペイン語表記に変換して表示ます。
         * @param args 英語表記の数字
         */
        static void toSpanish(String args) {
                String spanish = new String();
                if(args.equals("One")) {
                        spanish = "Uno";
                } else if(args.equals("Two")) {
                        spanish = "Dos";
                } else if(args.equals("Three")) {
                        spanish = "Tres";
                } else if(args.equals("Four")) {
                        spanish = "Quatro";
                } else if(args.equals("Five")) {
                        spanish = "Cinco";
                }
                System.out.println(spanish);
        }
}


/**
 * Translationクラスです。
 */
public class Translation {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                Language.toSpanish(args[0]);
        }
}
