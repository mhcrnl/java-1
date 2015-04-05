/*
 * EightObjects.java
 */

/**
 * EightObjectsクラスです。
 */
public class EightObjects {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args){
        Boolean bo = new Boolean(args[0]);
        Character ch = new Character(args[1].charAt(0));
        Byte by = new Byte(args[2]);
        Short sh = new Short(args[3]);
        Integer in = new Integer(args[4]);
        Long lo = new Long(args[5]);
        Float fl = new Float(args[6]);
        Double dou = new Double(args[7]);

        System.out.println(bo);
        System.out.println(ch);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(dou);
    }
}
