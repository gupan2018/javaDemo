package com.exceptionHandle.language;
/**
 * 这个类主要讲了自定义异常
 * 1. 继承自Exception
 * 2. 重写所有的Exception的构造方法
 * 3. 可以用了
 * @author Think
 *
 */
public class SelfDefException extends Exception{

	/**
	 * 加版本号是Exception实现了序列化接口
	 */
	private static final long serialVersionUID = 1L;

	public SelfDefException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SelfDefException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public SelfDefException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SelfDefException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SelfDefException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
