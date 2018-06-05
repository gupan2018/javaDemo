package com.mysql.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.dbcp.demo.DbPoolUtil;

/**
 * 这个类主要演示PrepareStatement的用法
 * 
 * @author gupan
 *
 */
public class PrepareStatementDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DbPoolUtil.getConnection();
			String dml1 = "INSERT INTO " 
					+ "gupan_demo01 "
					+ "( "
					+ "name, password "
					+ ") " 
					+ "VALUES " 
					+ "(?, ?)";
			// 将sql发送到数据库，创建执行计划
			// 返回值ps就代表执行计划
			PreparedStatement ps = conn.prepareStatement(dml1);
			
			// 替换执行计划中的参数，需按照顺序发送。
			ps.setString(1, "gungun");
			ps.setString(2, "900900");
			// 由于重用执行计划，所以sql执行效率高
			ps.executeUpdate();
			
			// 再次重用执行计划
			ps.setString(1, "gungun01");
			ps.setString(2, "900900");
			ps.executeUpdate();
			
			// 再次重用执行计划
			ps.setString(1, "gungun02");
			ps.setString(2, "90090003");
			ps.executeUpdate();
			
			// 再次重用执行计划
			ps.setString(1, "gungun05");
			ps.setString(2, "900900");
			ps.executeUpdate();
			// 执行执行计划
			
			
			String dql1 = "select * from gupan_demo01;";
			ResultSet rs = ps.executeQuery(dql1);
//			while(rs.next()){
//				int id = rs.getInt(1);
//				String sPassword = rs.getString(2);
//				String sName = rs.getString(3);	
//				System.out.println("id = " + id + ", " + "sName = " + sName + ", "  + "sPassword =" + sPassword);
//			}
			// ResultSetMetaData用来获取结果集的相关信息
			ResultSetMetaData rsm = rs.getMetaData();
			System.out.println(rsm.getColumnCount());
			ps.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DbPoolUtil.close(conn);
		}
		
	}
}
