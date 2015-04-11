class CallByValue2 {
  public static void main(String args[]) {
    // 変数を初期化する
    StringBuffer sb = new StringBuffer("abcde");

    // 変数を表示する
    System.out.println(sb);

    // メソッドを呼び出す
    a(sb);

    // もう一度変数を表示する
    System.out.println(sb);
  }

  public static void a(StringBuffer sb) {
    sb = new StringBuffer("wxyz");
  }
}
