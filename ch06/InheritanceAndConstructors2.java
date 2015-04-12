class S2 {
  int s2;
  S2(int s2) {
    System.out.println("S2 Constructor");
    this.s2 = s2;
  }
}

class T2 extends S2 {
  int t2;
  T2(int s2, int t2) {
    super(s2);
    System.out.println("T2 Constructor");
    this.t2 = t2;
  }
}

class U2 extends T2 {
  int u2;
  U2(int s2, int t2, int u2) {
    super(s2, t2);
    System.out.println("U2 Constructor");
    this.u2 = u2;
  }
}

class InheritanceAndConstructors2 {
  public static void main(String args[]) {
    U2 u2 = new U2(1, 2, 3);
    System.out.println("u2.s2 = " + u2.s2);
    System.out.println("u2.t2 = " + u2.t2);
    System.out.println("u2.u2 = " + u2.u2);
  }
}
