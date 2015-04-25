/*
 * FactoryHash.java
 */

import java.util.Stack;
import java.util.Vector;

/**
 * Toolクラスです。
 */
final class Tool {
	/**
	 * 工具ID
	 */
	private final int id;

	/**
	 * コンストラクタです。
	 * @param id 工具ID
	 */
	Tool(int id) {
		this.id = id;
	}

	/**
	 * 工具を使用します。
	 */
	void start() {
		try {
			System.out.println("Tool" + id);
			Thread.sleep((long)(Math.random() * 10000 + 10000 ));
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
	 * 4つの工具を格納するスタック
	 */
	Stack<Tool> tools;

	/**
	 * 2つの工具を格納するベクトル
	 */
	Vector<Tool> tool;

	/**
	 * 工具の最大数
	 */
	private static final int TOOL_MAX = 4;

	/**
	 * 一度に取り出す工具の最大数
	 */
	private static final int GET_MAX = 2;

	/**
	 * コンストラクタです。
	 */
	Mediator() {
		tools = new Stack<Tool>();
		tool = new Vector<Tool>();
		for(int i = 1; i <= TOOL_MAX; ++i) {
			tools.push(new Tool(i));
		}
	}

	/**
	 * 使用可能な工具を取得します
	 * @return 使用可能な工具
	 */
	synchronized Vector<Tool> get() {
		try {
			while(tools.size() < GET_MAX) {
				wait();
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		tool.clear();
		for(int i = 0; i < GET_MAX; ++i) {
			tool.add(tools.pop());
		}
		notifyAll();
		return new Vector<Tool>(tool);
	}

	/**
	 * 工具を使用します。
	 * @param tool 工具を格納したベクトル
	 */
	void use(Vector<Tool> tool) {
		for(Tool o : tool) {
			o.start();
		}
	}

	/**
	 * 工具を解放します。
	 * @param tool 工具を格納したベクトル
	 */
	synchronized void release(Vector<Tool> tool) {
		for(Tool o : tool) {
			System.out.println("release");
			this.tools.push(o);
		}
		notifyAll();
	}
}

/**
 * Workerクラスです。
 */
final class Worker extends Thread {
	/**
	 * 作業員ID
	 */
	int id;

	/**
	 * 調整役
	 */
	Mediator m;

	/**
	 * 2つの工具を格納するベクトル
	 */
	Vector<Tool> tool;

	/**
	 * コンストラクタです。
	 * @param id 作業員ID
	 * @param m 調整役
	 */
	Worker(int id, Mediator m) {
		this.id = id;
		this.m = m;
	}

	/**
	 * スレッドを実行します。
	 */
	public void run() {
		try {
			while(true) {
				tool = m.get();
				System.out.println("User" + id + ": " + tool);
				m.use(tool);
				m.release(tool);
				tool.clear();
				Thread.sleep(20 * 1000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/**
 * FactoryHashクラスです。
 */
public class FactoryHash {
	/**
	 * 作業員の最大数
	 */
	private static final int WORKER_MAX = 10;

	/**
	 * mainメソッドです。
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String[] args) {
		Mediator m = new Mediator();
		for(int i = 0; i < WORKER_MAX; ++i) {
			new Worker(i, m).start();
		}
	}
}
