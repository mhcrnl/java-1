/*
 * BankDemo.java
 */

class Account {
        private int balance = 0;

        void deposit(int amount) {
                synchronized(this) {
                        balance += amount;
                }
        }

        int getBalance() {
                return balance;
        }
}

class Customer extends Thread {
        Account account;

        Customer (Account account) {
                this.account = account;
        }
        
        public void run() {
                try {
                        for(int i = 0; i < 100000; ++i) {
                                account.deposit(10);
                        }
                }
                catch (Exception e) {
                        e.printStackTrace();
                }
        }
}

public class BankDemo {
        private final static int NUMCUSTOMERS = 10;
        public static void main(String[] args) {
                Account account = new Account();

                Customer[] customers = new Customer[NUMCUSTOMERS];
                for(int i = 0; i < NUMCUSTOMERS; ++i) {
                        customers[i] = new Customer(account);
                        customers[i].start();
                }

                for(int i = 0; i < NUMCUSTOMERS; ++i) {
                        try {
                                customers[i].join();
                        }
                        catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
                System.out.println(account.getBalance());
        }
}
