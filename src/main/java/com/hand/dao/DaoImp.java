package com.hand.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hand.connectionFactory.ConnectionFactory;

@Controller
@RequestMapping("Dao")
public class DaoImp {
	
	public DaoImp() {
	}
	
	@RequestMapping("/insert.do")
	public String insert(String filmTitle,String filmDescription,int filmLanguage_id){
		ConnectionFactory cf = ConnectionFactory.getFactory();
		
		Connection conn = cf.makeConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO film (title,description,language_id,rental_duration,rental_rate,replacement_cost) VALUES (?,?,?,3,2.20,2.00)");
			ps.setString(1, filmTitle);
			ps.setString(2, filmDescription);
			ps.setInt(3, filmLanguage_id);
			ps.execute();
			System.out.println("插入成功");
				return "";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "输入有误，插入失败，请重新执行";
		}
	}
}
