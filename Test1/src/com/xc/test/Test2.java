package com.xc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test2 {
public static void main(String[] args) {
  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    //����������Ϣ
    String url ="jdbc:mysql://127.0.0.1:3306/hd";
    String user="root";
    String password = "1234";
    //3.��ȡ����ӡ����
    Connection conn=DriverManager.getConnection(url,user,password);
    System.out.println(conn);

    
    
    
    
    
    
    
    
  } catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
