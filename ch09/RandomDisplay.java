/*
 * RandomDisplay.java
 */

/**
 * RandomDiplayクラスです。
 */
public class RandomDisplay {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                while(true) {
                        System.out.println((int)(Math.random() * 5 + 5));
                        try {
                                Thread.sleep(3000);
                        }
                        catch (InterruptedException e){
                                e.printStackTrace();
                        }
                }         
        }
}
