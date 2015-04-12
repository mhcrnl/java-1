/*
 * Bank.java
 */

/**
 * Transferクラスです。
 */
final class Transfer {
        /**
         * 口座番号
         */
        String accountNumber;
        
        /**
         * コンストラクタです。
         * @param accountNumber 口座番号
         */
        Transfer(String accountNumber) {
                assert accountNumber.matches("^[0-9]{9}$");
                this.accountNumber = accountNumber;
        }

        /**
         * 振込金額を受け取ります。
         * @param money 振込金額
         */
        void transfer(int money) {
                assert money > 0;
        }
}

/**
 * Bankクラスです。
 */
public class Bank {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                Transfer t = new Transfer("123456789");
                t.transfer(0);
                System.out.println(t.accountNumber);
        }
}
