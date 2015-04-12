/*
 * LuminousDemo.java
 */

/**
 * LuminousObjectインターフェイスです。
 */
interface LuminousObject {
        /**
         * lightOffメソッドです。
         */
        void lightOff();

        /**
         * lightOnメソッドです。
         */
        void lightOn();
}

/**
 * SolidObjectクラスです。
 */
abstract class SolidObject {
}

/**
 * Coneクラスです。
 */
class Cone extends SolidObject{
}

/**
 * Cubeクラスです。
 */
class Cube extends SolidObject {
}

/**
 * LuminousConeクラスです。
 */
final class LuminousCone extends Cone implements LuminousObject{
        public void lightOff() {
                System.out.println("Cone light off");
        }
        public void lightOn() {
                System.out.println("Cone light on");
        }
}

/**
 * LuminousCubeクラスです。
 */
final class LuminousCube extends Cube implements LuminousObject {
        public void lightOff() {
                System.out.println("Cube light off");
        }
        public void lightOn() {
                System.out.println("Cube light on");
        }
}

/**
 * LuminousDemoクラスです。
 */
public class LuminousDemo {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                LuminousObject l;
                l = new LuminousCone();
                l.lightOff();
                l.lightOn();
                l = new LuminousCube();
                l.lightOff();
                l.lightOn();
        }
}
