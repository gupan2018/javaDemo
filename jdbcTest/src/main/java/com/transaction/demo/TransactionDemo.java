package com.transaction.demo;
import java.sql.Connection;
import java.sql.SQLException;

import com.dbcp.demo.DbPoolUtil;

/**
 * 这个了类主要讲了事务处理
 * 
 * @author gupan
 *
 */

public class TransactionDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DbPoolUtil.getConnection();
			// 获取当前事务的提交方式，true为自动提交，默认为true
//			System.out.println(conn.getAutoCommit());
			
			// 设置事务提交方式
			// 取消事务自动提交，后续手动提交
			conn.setAutoCommit(false);
			
			// 提交事务
			conn.commit();
		} catch (Exception e) {
			// TODO: handle exception
			// 调用自己封装的工具类，回滚事务
			e.printStackTrace();
			DbPoolUtil.rollback(conn);
		}finally {
			DbPoolUtil.close(conn);
		}
	}
}
