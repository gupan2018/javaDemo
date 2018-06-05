package com.dbcp.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

import com.db.utils.DbUtils;

/**
 * 连接池版本数据库连接工具类，适用于并发场合
 * @author gupan
 *
 */
public class DbPoolUtil {
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	private static int initSize;
	private static int maxActive;
	
	/**
	 * 初始化静态属性
	 */
	static {
		Properties cfg = new Properties();
		InputStream in = DbUtils.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			cfg.load(in);
			
			// 初始化连接参数
			driver = cfg.getProperty("jdbc.driver");
			url = cfg.getProperty("jdbc.url");
			user = cfg.getProperty("jdbc.user");
			pwd = cfg.getProperty("jdbc.pwd");
			
			// 设置初始时的连接数
			initSize = Integer.parseInt(cfg.getProperty("jdbc.initSize"));
			// 设置最大的活动连接数
			maxActive = Integer.parseInt(cfg.getProperty("jdbc.maxActive"));
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
			// 创建BasicDataSource对象
			BasicDataSource ds = new BasicDataSource();
			/*
			 * 填写必选参数
			 */
			ds.setDriverClassName(driver);
			ds.setUrl(url);
			ds.setUsername(user);
			ds.setPassword(pwd);
			
			/*
			 *  设置连接池的管理策略参数
			 */
			// 设置初始时的连接数
			ds.setInitialSize(initSize);
			// 设置最大的活动连接数
			ds.setMaxActive(maxActive);
			
			// 建立连接
			conn = ds.getConnection();
			return conn;
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
				// 归还数据库连接池，不是真的关闭
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public static void rollback(Connection conn){
		// 排除控制台异常
		if (conn != null) {
			try {
				// 回滚事务
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
