package com.mysql.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.StampedLock;
import java.sql.Connection;
/**
 * 演示jdbc连接数据库
 * 
 * @author gupan
 *
 */
public class MysqlConn {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// 装载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://127.0.0.1:3306/mysql";
			String user = "gupan";
			String pwd = "free930923";
			// 建立连接
			conn = DriverManager.getConnection(url, user, pwd);
			
			// 输出conn引用对象的实际类型
//			System.out.println(conn.getClass());
			stmt = conn.createStatement();
			
			// 执行sql
			/*
			 * 返回true代表有结果集，返回false代表没有结果集
			 * 创建失败跑出异常
			 */
			String ddl1 = "CREATE TABLE gupan_demo01 ("
					+ "id int primary key auto_increment, " 
					+ "password varchar(30), "
					+ "name varchar(30)" 
					+ ");";
//			boolean flag = stmt.execute(ddl1);
//			System.out.println(flag);
			
			String dml1 = "INSERT INTO " 
					+ "gupan_demo01 "
					+ "( "
					+ "name, password "
					+ ") " 
					+ "VALUES " 
					+ "( "
					+ "'gupan', '123456'"
					+ "), "
					+ "( "
					+ "'yuangungun', '234567'"
					+ ")"
					;
			/*
			 * executeUpdate返回结果是一个int类型，这条sql语句表示更新/添加/删除的记录数，失败抛出异常
			 */
//			int rows = stmt.executeUpdate(dml1);
//			System.out.println(rows);
			
			/*
			 * executeQuery返回ResultSet结果集，代表二位查询结果，一般使用for循环遍历处理，查询失败抛出异常
			 */
			String dql1 = "select * from gupan_demo01;";
			ResultSet rs = stmt.executeQuery(dql1);
			
			/*
			 * 解析ResultSet结果集
			 */
			while(rs.next()){
				int id = rs.getInt(1);
				String sPassword = rs.getString(2);
				String sName = rs.getString(3);	
				System.out.println("id = " + id + ", " + "sName = " + sName + ", "  + "sPassword =" + sPassword);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				// 关闭陈述对象
				stmt.close();
				// 关闭数据库连接
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
