/*
 * AbstractVehicle.java
 */

/**
 * Vehicleクラスです。
 */
abstract class Vehicle {
        /**
         * 車輪の数を返します。
         * @return 車輪の数
         */
        abstract int numwheels();
}

/**
 * Carクラスです。
 */
class Car extends Vehicle{
        /**
         * 車輪の数を返します。
         * @return 車輪の数
         */
        public int numwheels() {
                return 4;
        }
}

/**
 * Truckクラスです。
 */
class Truck extends Vehicle{
        /**
         * 車輪の数を返します。
         * @return 車輪の数
         */
        public int numwheels() {
                return 6;
        }
}

/**
 * AbstractVehicleクラスです。
 */
public class AbstractVehicle {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                Car c = new Car();
                Truck t = new Truck();
                System.out.println(c.numwheels());
                System.out.println(t.numwheels());
        }
}
