/*
 * FiveObjectsArray.java
 */

/**
 * FiveObjectsArrayクラスです。
 */
public class FiveObjectsArray {
    /**
     * mainメソッドです。
     *
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        Integer[] IntegerArray = {1, 2, 3, 4, 5};
        String[] StringArray = {"a1", "b2", "c3", "d4", "e5"};
        Boolean[] BooleanArray = {true, false, true, false, true};
        Character[] CharacterArray = {'a', 'b', 'c', 'd', 'e'};
        Double[] DoubleArray = {0.1, 0.2, 0.3, 0.4, 0.5};

        for (int i = 0; i < IntegerArray.length; ++i) {
            System.out.print(IntegerArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < StringArray.length; ++i) {
            System.out.print(StringArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < BooleanArray.length; ++i) {
            System.out.print(BooleanArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < CharacterArray.length; ++i) {
            System.out.print(CharacterArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < DoubleArray.length; ++i) {
            System.out.print(DoubleArray[i] + " ");
        }
        System.out.println();
    }
}
