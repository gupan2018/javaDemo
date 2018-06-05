package com.mysql.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Arrays;

import com.dbcp.demo.DbPoolUtil;
/**
 * 事务批量操作数据库（DML语句）
 * 
 * @author gupan
 *
 */
public class BatchOpDemo {
	
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
			
			for (int i = 0; i < 10000; i++) {
				String name = "yuangungun0000" + i;
				String pwd = "93csad23";
				
				ps.setString(1, name);
				ps.setString(2, pwd);
				
				/*
				 * 需要注意：
				 * 		如果PreparedStatement中缓存的过多的待处理SQL语句，那么会出现OutOfMemory错误。
				 * 比较常用的方式的分批处理sql语句
				 */
				ps.addBatch();
				
				if ((i + 1) % 8 == 0) {
					// 执行执行计划addBatch和executeBatch()结合使用
					/*
					 * 返回数组返回值说明
					 * 		执行多少条sql语句，返回数组中就会有多少个数，可以根据返回值的数值，
					 * 判断相应sql语句是否执行成功
					 */
					int [] ary = ps.executeBatch();
					
					// 清空缓冲区，其实这里不清空也行
					ps.clearBatch();
				}
			}
			// 处理余下的sql
			int [] ary = ps.executeBatch();
			System.out.println(Arrays.toString(ary));
			
			String dql1 = "select * from gupan_demo01;";
			ResultSet rs = ps.executeQuery(dql1);
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