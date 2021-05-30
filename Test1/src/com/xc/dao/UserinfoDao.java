package com.xc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xc.entity.Userinfo;

public class UserinfoDao {

	public ResultSet selectUserInfo(Userinfo userinfo) throws ClassNotFoundException, SQLException {
		ResultSet rs = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/hd";
		String user = "root";
		String password = "1234";
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		String sql = "select * from userinfo where account = '" + userinfo.account + "' and password = '"+userinfo.password+"'";
		rs = st.executeQuery(sql);
		return rs;

	}

	public List<Userinfo> selectUserInfoAll() throws ClassNotFoundException, SQLException {
		List<Userinfo> list = new ArrayList<Userinfo>();
		ResultSet rs = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/hd";
		String user = "root";
		String password = "1234";
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		String sql = "select * from userinfo";
		ResultSet rs2 = st.executeQuery(sql);
       
        while(rs2.next()){//循环一次是一行
        	Userinfo userinfo = new Userinfo();
        	userinfo.username = rs2.getString("username");
        	userinfo.account = rs2.getString("account");
        	userinfo.password = rs2.getString("password");
        	list.add(userinfo);
        }
        return list;

	}

	public void insertUserInfo(Userinfo userinfo) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/hd";
		String user = "root";
		String password = "1234";
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		String sql = "insert into userinfo values('" + userinfo.account + "','" + userinfo.password + "','"
				+ userinfo.username + "')";
		st.execute(sql);
	}

	public void updateUserInfo(Userinfo userinfo) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/hd";
		String user = "root";
		String password = "1234";
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		String sql = "update userinfo set username = '" + userinfo.username + "'," + "password = '" + userinfo.password
				+ "' where account = '" + userinfo.account + "'";
		st.execute(sql);
	}

	public void deleteUserInfo(String ac) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/hd";
		String user = "root";
		String password = "1234";
		Connection conn = DriverManager.getConnection(url, user, password);

		Statement st = conn.createStatement();
		String sql = "delete from userinfo where account = '" + ac + "'";
		st.execute(sql);

	}
}
