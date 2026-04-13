package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbConfig.GetConnection;
import dto.User;

public class UserDao {
	
	public int addUser(User obj) {
		int i=0;
		try {
			Connection con = GetConnection.getConnect();
			String query = "insert into user(username,email,password,address) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, obj.getUsername());
			ps.setString(2, obj.getEmail());
			ps.setString(3, obj.getPassword());
			ps.setString(4, obj.getAddress());
			
			i = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return i;
	}
	
	public int checkUser(String email,String password) {
		int i=0;
		try {
			Connection con = GetConnection.getConnect();
			String query = "select * from user where email=? and password=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				i=1;
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return i;
	}

	public User getUserDetails(String email) {
		User user = new User();
		try {
			Connection con = GetConnection.getConnect();
			String query = "select * from user where email=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				user.setUsername(rs.getString(1));
				user.setEmail(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setAddress(rs.getString(4));
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return user;
	}
	public int updateUser(User obj) {
		int i=0;
		try {
			Connection con = GetConnection.getConnect();
			String query = "update user set username=?,password=?,address=? where email=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, obj.getUsername());
			ps.setString(2, obj.getPassword());
			ps.setString(3, obj.getAddress());
			ps.setString(4, obj.getEmail());
			
			i = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return i;
	}

}
