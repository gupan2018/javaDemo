package com.mysql.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.dbcp.demo.DbPoolUtil;
/**
 * 这个类主要用以获取结果元数据
 * 		在前述获取查询结果的方法中，直接通过next一步步获取查询结果，然后利用get方法获取数据，
 * 但是不能获取其他信息。ResultSetMetaData存储了描述查询结果的相关信息，其中包含列名称、列数
 * 量、数据类型等信息，可以在其中获取有用的信息。
 * @author gupan
 *
 */
public class ResultSetMetaDataDemo {
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
			
			String dql1 = "select * from gupan_demo01;";
			ResultSet rs = ps.executeQuery(dql1);
			/*
			 * 获取结果及元数据
			 */
			ResultSetMetaData rsm = rs.getMetaData();
			// 获取有多少列
			int n = rsm.getColumnCount();
			for (int i = 1; i <= n ; i++) {
				String col = rsm.getColumnName(i);
				System.out.println(col);
			}
			
			ps.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DbPoolUtil.close(conn);
		}
		
	}
}