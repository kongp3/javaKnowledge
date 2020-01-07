package com.cto.edu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 通过jdbc访问数据库的步骤
 */
public class JdbcTest {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 注意提前要添加java链接mysql的驱动包
			String driver = "com.mysql.jdbc.Driver";
			String url =  "jdbc:mysql://127.0.0.1/test";
			String user = "root";
			String password = "123456";
			Class.forName(driver); // 加载JDBC驱动程序
			conn = DriverManager.getConnection(url, user,password);  // 创建数据库连接 
			String sql = "select * from t_user u,t_dep d where u.dep_id=d.dep_id and d.dep_id like ?";
			String depId = "0101";
		    pstmt = conn.prepareStatement(sql); // 创建Statement或PreparedStatement对象
			pstmt.setString(1, depId + "%"); //　传递参数，可以有多个

			rs = pstmt.executeQuery(); //执行SQL语句
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
				if(null != pstmt) pstmt.close();
				if(null != conn) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
