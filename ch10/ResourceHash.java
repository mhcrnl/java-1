/*
 * ResouceHash.java
 */

import java.util.Stack;

/**
 * Resouceクラスです。
 */
final class Resource {

        /**
          * リソースを使用します。
          */
	void start() {
		try {
			System.out.println("Resource using");
			Thread.sleep((long)((Math.random() * 8 + 1) * 1000));
			System.out.println("Resource used");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/**
 * Mediatorクラスです。
 */
final class Mediator {
	/**
	 * リソース格納用スタック
	 */
	Stack<Resource> s;

	/**
	 * スタックの最大数
	 */
	private static final int STACK_MAX = 4;

	/**
	 * コンストラクタです。
	 */
	Mediator() {
		s = new Stack<Resource>();
		for(int i = 0; i < STACK_MAX; ++i) {
			s.push(new Resource());
		}
	}

	/**
	 * 使用可能なリソースを確保します。
	 * @return 使用可能なリソース
	 */
	synchronized public Resource get() {
		try {
			while (s.empty()) {
				wait();
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		notifyAll();
		return s.pop();
	}

	/**
	 * リソースを使用します
	 * @param r リソース
	 */
	public void use(Resource r) {
		r.start();
	}

	/**
	 * リソースを解放します。
	 * @param r リソース
	 */
	synchronized public void release(Resource r) {
		s.push(r);
		notifyAll();
	}
}

/**
 * Taskクラスです。
 */
final class Task extends Thread {
	/**
	 * 調整役
	 */
	private final Mediator mediator;

	/**
	 * リソース
	 */
	private Resource r;

	/**
	 * コンストラクタです。
	 * @param mediator 調整役
	 */
	Task(Mediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * スレッドを実行します。
	 */
	public void run() {
		try {
			while(true) {
				r = mediator.get();
				mediator.use(r);
				mediator.release(r);
				Thread.sleep(8000);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/**
 * ResouceHashクラスです。
 */
public class ResourceHash {
	/**
	 * タスクの最大数
	 */
	private static final int TASK_MAX = 10;

	/**
	 * mainメソッドです。
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String[] args) {
		Mediator m = new Mediator();
		for(int i = 0; i < TASK_MAX; ++i) {
			new Task(m).start();
		}
	}
}
