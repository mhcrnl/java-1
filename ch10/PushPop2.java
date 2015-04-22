import java.util.*;

/*
 * PushPop2.java
 */

/**
 * PushPop2クラスです。
 */
public class PushPop2 {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                Stack<Integer> stack = new Stack<Integer>();

                for(int i = 0, l = args.length; i < l; ++i) {
                        Integer integ = new Integer(args[i]);
                        if(stack.search(integ) == -1) {
                                stack.push(integ);
                        }
                }

                while(!stack.empty()) {
                        Integer obj = stack.pop();
                        System.out.println(obj);
                }
        }

}

