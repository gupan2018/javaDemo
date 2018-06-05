package com.db.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class UseUtil2Conn {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DbUtils.getConnection();	
			stmt = conn.createStatement();
			
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
//			int rows = stmt.executeUpdate(dml1);
//			System.out.println(rows);
			
			String dql1 = "select * from gupan_demo01;";
			ResultSet rs = stmt.executeQuery(dql1);
			
			while(rs.next()){
				int id = rs.getInt(1);
				String sPassword = rs.getString(2);
				String sName = rs.getString(3);	
				System.out.println("id = " + id + ", " + "sName = " + sName + ", "  + "sPassword =" + sPassword);
			}
			
			/*
			 * 对于多条查询语句，应该释放查询结果，释放语句对象 ，否则会扩大内存开销，影响程序性能
			 */
			rs.close();// 释放查询结果
			stmt.close(); // 释放语句对象
		}catch (Exception e){
			e.printStackTrace();
			DbUtils.close(conn);
		}
	}
}
