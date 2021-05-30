package com.xc.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.xc.dao.UserinfoDao;
import com.xc.entity.Userinfo;

public class Test3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserinfoDao da = new UserinfoDao();
		// da.deleteUserInfo("ls");
//		Userinfo userinfo = new Userinfo();
//		userinfo.account = "ls";
//		userinfo.username = "ÀîËÄ¹â";
//		userinfo.password = "666";
//		da.updateUserInfo(userinfo);
		
		
		Userinfo userinfo = new Userinfo();
		userinfo.account = "hq";
		userinfo.username = "Øi°Ë½ä";
		userinfo.password = "666";
		ResultSet rs =  da.selectUserInfo(userinfo);
		System.out.println(rs.next());
		
		

        
         
//        List<Userinfo> list=da.selectUserInfoAll();
//        for(Userinfo u:list) {
//        	System.out.println(u.account+u.username+u.password);
//        }
        

	}
}
