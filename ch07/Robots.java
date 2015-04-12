/*
 * Robots.java
 */

/**
 * Locomotionインターフェイスです。
 */
interface Locomotion {
        /**
         * 進む
         */
        void forward();

        /**
         * 逆周り
         */
        void reverse();

        /**
         * 止まる
         */
        void stop();
}

/**
 * Soundインターフェイスです。
 */
interface Sound {
        /**
         * ビープ音を鳴らす
         */
        void beep();
}

/**
 * Robotクラスです。
 */
abstract class Robot {
}

/**
 * RobotAクラスです。
 */
class RobotA extends Robot {
}

/**
 * RobotBクラスです。
 */
class RobotB extends Robot implements Locomotion {
        public void forward(){
                System.out.println("RobotB forward");
        }
        public void reverse(){
                System.out.println("RobotB reverse");
        }
        public void stop(){
                System.out.println("RobotB stop");
        }
}

/**
 * RobotCクラスです。
 */
class RobotC extends Robot implements Locomotion, Sound {
        public void forward(){
                System.out.println("RobotC forward");
        }
        public void reverse(){
                System.out.println("RobotC reverse");
        }
        public void stop(){
                System.out.println("RobotC stop");
        }
        public void beep() {
                System.out.println("RobotC beep");
        }
}

/**
 * RobotA1クラスです。
 */
final class RobotA1 extends RobotA implements Sound {
        public void beep() {
                System.out.println("RobotA1 beep");
        }
}

/**
 * RobotB1クラスです。
 */
final class RobotB1 extends RobotB implements Sound {
        public void forward(){
                System.out.println("RobotB1 forward");
        }
        public void reverse(){
                System.out.println("RobotB1 reverse");
        }
        public void stop(){
                System.out.println("RobotB1 stop");
        }
        public void beep() {    
                System.out.println("RobotB1 beep");
        }
}

/**
 * RobotB2クラスです。
 */
final class RobotB2 extends RobotB {
        public void forward(){
                System.out.println("RobotB2 forward");
        }
        public void reverse(){
                System.out.println("RobotB2 reverse");
        }
        public void stop(){
                System.out.println("RobotB2 stop");
        }
}

/**
 * RobotC1クラスです。
 */
final class RobotC1 extends RobotC {
        public void forward(){
                System.out.println("RobotC1 forward");
        }
        public void reverse(){
                System.out.println("RobotC1 reverse");
        }
        public void stop(){
                System.out.println("RobotC1 stop");
        }
        public void beep() {
                System.out.println("RobotC1 beep");
        }
}

/**
 * Robotsクラスです。
 */
public class Robots {
        /**
         * ロボットの個数
         */
        private static final int ROBOT_NUM = 7;
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Robot[] r = new Robot[ROBOT_NUM];
                r[0] = new RobotA();
                r[1] = new RobotB();
                r[2] = new RobotC();
                r[3] = new RobotA1();
                r[4] = new RobotB1();
                r[5] = new RobotB2();
                r[6] = new RobotC1();

                for(int i = 0; i < ROBOT_NUM; ++i) {
                        if(r[i] instanceof Locomotion) {
                                Locomotion l = (Locomotion)r[i];
                                l.stop();
                        }
                }
                System.out.println();
                for(int i = 0; i < ROBOT_NUM; ++i) {
                        if(r[i] instanceof Sound) {
                                Sound s = (Sound)r[i];
                                s.beep();
                        }
                }
        }
}
