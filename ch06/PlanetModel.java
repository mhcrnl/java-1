/*
 * PlanetModel.java
 */

/**
 * Planetクラスです。
 */
class Planet {
        /**
         * 惑星の名前
         */
        String name = new String();

        /**
         * 惑星の数
         */
        int count;

        /**
         * コンストラクタです。
         * @param name 惑星の名前
         * @param count 惑星の数
         */
        public Planet(String name, int count) {
                this.name = name;
                this.count = count;
        }

        /**
         * 情報を表示します。
         */
        public void display() {
                System.out.println("name: " + name + "; count: " + count);
        }
}

/**
 * SolarSystemクラスです。
 */
class SolarSystem {
        /**
         * それぞれの惑星への参照
         */
        Planet p1, p2, p3, p4, p5, p6, p7, p8, p9;
        
        /**
         * コンストラクタです。
         */
        public SolarSystem() {
                this.p1 = new Planet("Mercury", 1);
                this.p2 = new Planet("Venus", 1);
                this.p3 = new Planet("Earth", 1);
                this.p4 = new Planet("Mars", 1);
                this.p5 = new Planet("Jupiter", 1);
                this.p6 = new Planet("Saturn", 1);
                this.p7 = new Planet("Uranus", 1);
                this.p8 = new Planet("Neptune", 1);
                this.p9 = new Planet("Pluto", 1);
        }

        /**
         * 情報を表示します。
         */
        public void display() {
                p1.display();
                p2.display();
                p3.display();
                p4.display();
                p5.display();
                p6.display();
                p7.display();
                p8.display();
                p9.display();
        }
}

/**
 * PlanetModelクラスです。
 */
public class PlanetModel {
        /**
         * mainメソッドです。
         * @param args コマンドライン引数（未使用）
         */
        public static void main(String[] args) {
                SolarSystem s = new SolarSystem();
                s.display();
        }
}
