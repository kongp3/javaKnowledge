package com.cto.edu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * sql 注入模拟测试
 */
public class SqlInjectionTest {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 登录的用户名和密码，比如登录页的两个参数是用户名和密码
		String name = "zhangsan1";
		String pwd = "123";
		
		// 模拟sql注入
		name = "' OR '1'='1";
		try {
			// 注意提前要添加java链接mysql的驱动包
			String driver = "com.mysql.jdbc.Driver";
			String url =  "jdbc:mysql://127.0.0.1/test";
			String user = "root";
			String password = "123456";
			Class.forName(driver); // 加载JDBC驱动程序
			conn = DriverManager.getConnection(url, user,password);  // 创建数据库连接 
			String sql = "select * from t_user u where u.name= '" + name + "' and password='" + pwd + "'";
			System.out.println("执行的sql: " + sql);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //执行SQL语句
			
			// 处理sql的返回结果
			while (rs.next()) {
				System.out.println(rs.getString("user_id") + "," +rs.getString("name") + "," +rs.getString("dep_id")+ "," +rs.getString("sex"));
			}

		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		} finally {
			try {
				// 注意下关闭的顺序,关闭创建的各个对象
				if(null != rs) rs.close();
				if(null != stmt) stmt.close();
				if(null != conn) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
