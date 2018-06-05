package com.mysql.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Arrays;

import org.omg.CORBA.COMM_FAILURE;

import com.dbcp.demo.DbPoolUtil;
import java.sql.Statement;

/**
 * 这个类主要是演示了获取自增字段
 * 
 * @author gupan
 *
 */
public class AcquireAutoIncreaCol {
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DbPoolUtil.getConnection();
			/*
			String dml_create_1 = "CREATE TABLE r_post "
					+ "( "
					+ "id int primary key auto_increment, "
					+ "content varchar(8), "
					+ "k_id int "
					+ ");";
			
			String dml_create_2 = "CREATE TABLE r_keywords "
					+ "( "
					+ "id int primary key auto_increment, "
					+ "word varchar(8)"
					+ ");";
			
			// 建表语句
			Statement st = conn.createStatement();
			st.addBatch(dml_create_1);
			st.addBatch(dml_create_2);
			int [] ary = st.executeBatch();
			System.out.println(Arrays.toString(ary));
			*/
			conn.setAutoCommit(false);
			String dml1 = "INSERT INTO " 
					+ "r_keywords "
					+ "( "
					+ "word "
					+ ") " 
					+ "VALUES " 
					+ "(?)";
			
			// 自动生成序号的列名
			String [] cols = {"id"};
			
			String dml2 = "INSERT INTO " 
					+ "r_post "
					+ "( "
					+ "content, k_id "
					+ ") " 
					+ "VALUES " 
					+ "(?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(dml1, cols);
			ps.setString(1, "雾霾");
			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("话题添加失败");
			}
			
			// 获取自动生成的id值
			// rs存储的是一行一列的元数据，就是我们获取的自增字段的值
			ResultSet rs = ps.getGeneratedKeys();
			int id = -1;
			while(rs.next()) {
				// 只能通过列数获取值
				id = rs.getInt(1);
			}
			rs.close();
			ps.close();
			
			// 开始插入关联数据到另一张表
			ps = conn.prepareStatement(dml2);
			ps.setString(1, "今天有雾霾");
			ps.setInt(2, id);
			n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("发帖失败");
			}
			conn.commit();
			ps.close();
			System.out.println("OK");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			DbPoolUtil.rollback(conn);
		}finally {
			DbPoolUtil.close(conn);
		}
	}
}
