package com.dbcp.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 这个类主要讲了数据库连接池的用法
 * 
 * @author gupan
 *
 */
public class DbcpDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DbPoolUtil.getConnection();
			Statement st = conn.createStatement();
			
			String dql1 = "select * from gupan_demo01;";
			ResultSet rs = st.executeQuery(dql1);
			
			while(rs.next()){
				int id = rs.getInt(1);
				String sPassword = rs.getString(2);
				String sName = rs.getString(3);	
				System.out.println("id = " + id + ", " + "sName = " + sName + ", "  + "sPassword =" + sPassword);
			}
			
			rs.close();// 释放查询结果
			st.close(); // 释放语句对象
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 归还数据库连接池，不是真的关闭
			DbPoolUtil.close(conn);
		}
	}
}
