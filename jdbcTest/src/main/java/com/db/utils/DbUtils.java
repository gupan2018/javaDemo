package com.db.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.management.RuntimeErrorException;
/**
 * 封装数据库连接过程，简化数据库连接
 * 
 * @author gupan
 *
 */
public class DbUtils {
	static String driver;
	static String url;
	static String user;
	static String pwd;
	
	/**
	 * 初始化静态属性
	 */
	static {
		Properties cfg = new Properties();
		InputStream in = DbUtils.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			cfg.load(in);
//			System.out.println(cfg);
			// 初始化连接参数
			driver = cfg.getProperty("jdbc.driver");
			url = cfg.getProperty("jdbc.url");
			user = cfg.getProperty("jdbc.user");
			pwd = cfg.getProperty("jdbc.pwd");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	
	public static Connection getConnection(){
		Connection conn = null;
		// 装载驱动
		
		try {
			Class.forName(driver);
			// 建立连接
			conn = DriverManager.getConnection(url, user, pwd);
			
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/**
	 * 封锁复杂的数据库关闭方法
	 * @param stmt
	 * @param conn
	 */
	public static void close(Connection conn) {		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
