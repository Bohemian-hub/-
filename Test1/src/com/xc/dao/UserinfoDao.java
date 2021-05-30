package com.xc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserinfoDao {
	public void deleteUserInfo(String ac) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url ="jdbc:mysql://127.0.0.1:3306/hd";
				String user="root";
				String password = "1234";
				Connection conn = DriverManager.getConnection(url,user,password);

				Statement st =conn.createStatement();
				String sql = "delete from userinfo where account = '"+ac+"'";
				st.execute(sql);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
