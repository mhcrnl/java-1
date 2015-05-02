import java.io.PrintWriter;

/**
 * PrintWriterDemo2クラスです。
 */
public class PrintWriterDemo2 {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                try {
                        if (args.length != 1) {
                                System.out.println("引数の数が不正です。");
                                System.exit(1);
                        }
                        PrintWriter pw = new PrintWriter(args[0]);
                        pw.println(true);
                        pw.println('A');
                        pw.println(500);
                        pw.println(40000L);
                        pw.println(45.67f);
                        pw.println(45.67);
                        pw.println("Hello");
                        pw.println(new Integer("99"));
                        pw.close();
                }
                catch(Exception e) {
                        e.printStackTrace();
                }
        }
}

