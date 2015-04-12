/*
 * Cars.java
 */

/**
 * AntiLockBrakesインターフェイスです。
 */
interface AntiLockBrakes {
        /**
         * AntiLockBrakesメソッド
         */
        void AntiLockBrakes();
}

/**
 * CruiseControlインターフェイスです。
 */
interface CruiseControl {
        /**
         * CruiseControlメソッド
         */
        void CruiseControl();
}

/**
 * PowerSteeringインターフェイスです。
 */
interface PowerSteering{
        /**
         * PowerSteeringメソッド
         */
        void PowerSteering();
}

/**
 * Autoクラスです。
 */
abstract class Auto {
}

/**
 * Model1クラスです。
 */
final class Model1 extends Auto implements PowerSteering {
        public void PowerSteering() {
                System.out.println("PowerSteering");
        }
}

/**
 * Model2クラスです。
 */
final class Model2 extends Auto implements AntiLockBrakes,CruiseControl {
        public void AntiLockBrakes() {
                System.out.println("AntiLockBrakes");
        }

        public void CruiseControl() {
                System.out.println("CruiseControl");
        }
}

/**
 * Model3クラスです。
 */
final class Model3 extends Auto implements CruiseControl {
        public void CruiseControl() {
                System.out.println("CruiseControl");
        }
}

/**
 * Carsクラスです。
 */
public class Cars {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数
         */
        public static void main(String[] args) {
                Model1 m1 = new Model1();        
                Model2 m2 = new Model2();        
                Model3 m3 = new Model3();        
                m1.PowerSteering();
                m2.AntiLockBrakes();
                m2.CruiseControl();
                m3.CruiseControl();
        }
}
