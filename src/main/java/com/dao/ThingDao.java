package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.bo.ThingInfoBo;
import com.bo.PeopleInfoBo;

public class ThingDao {

public static Connection getConnection() {
		
		Connection con=null;
		
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/ParkManagment";
			
			String username="root";
			
			String pass="Root";
			
			con=DriverManager.getConnection(url,username,pass);
			
			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;

		}
		
		
	
		
		
	
		
		public static boolean adminValidate(String adminemail,String adminpassword)
		{
			boolean status=false;
			
			
			try
			{
				
				
				Connection con=ThingDao.getConnection();
				
				String sql="select * from admin where adminemail=? and adminpassword=?";
				
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setString(1, adminemail);
				ps.setString(2, adminpassword);
				
				ResultSet rs=ps.executeQuery();
				
				status=rs.next();
				
				
				
				
				
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			return status;
		
		
	}
		
		public static int addPeople(PeopleInfoBo sb) {
			
			int status=0;
			
			
			try 
			{
				
				
				
				Connection con=ThingDao.getConnection();
				
				String sql="Insert into addpeople (fullName,email,dob,phone,things_to_do,idType,idNumber) values(?,?,?,?,?,?,?) ";
				
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setString(1, sb.getFullName());
				ps.setString(2, sb.getEmail());
				ps.setString(3, sb.getDob());
				ps.setString(4, sb.getPhone());
				ps.setString(5, sb.getThings_to_do());
				ps.setString(6, sb.getIdType());
				ps.setString(7, sb.getIdNumber());
				
				status=ps.executeUpdate();
			}
			
			catch(Exception e) 
			{
				System.out.println(e);
				
			}
			
			return status;
			
			
		}
		
		public static List getPeopleData()
		{
			
			List <PeopleInfoBo>list=new ArrayList<>();
			
			
			try
			{
				
				Connection con=ThingDao.getConnection();
				String sql="select * from addpeople";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
					
				{
					
					PeopleInfoBo sb=new PeopleInfoBo();
					
					sb.setId(rs.getInt(1));
					sb.setFullName(rs.getString(2));
					sb.setEmail(rs.getString(3));
					sb.setDob(rs.getString(4));
					sb.setPhone(rs.getString(5));
					sb.setThings_to_do(rs.getString(6) );
					sb.setIdType(rs.getString(7));
					sb.setIdNumber(rs.getString(8));
					
					list.add(sb);
					
					
					
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			
			
			
			
			
			return list;
			
			
		}
		
		public static PeopleInfoBo getInfoById(int id)
		{
			PeopleInfoBo sb=new PeopleInfoBo();
			
			try {
				
				Connection con=ThingDao.getConnection();
				String sql="select * from addpeople where id=?";
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				
				ResultSet rs=ps.executeQuery();
				
				if(rs.next())
				{
					sb=new PeopleInfoBo();
					
					sb.setId(rs.getInt(1));
					sb.setFullName(rs.getString(2));
                    sb.setEmail(rs.getString(3));
					sb.setDob(rs.getString(4));
					sb.setPhone(rs.getString(5));
					sb.setThings_to_do(rs.getString(6) );
					sb.setIdType(rs.getString(7));
					sb.setIdNumber(rs.getString(8));
					
					
				}
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			return sb;
			
		}
		
		
		public static int updatePeople(PeopleInfoBo sb)
		{
			int status=0;
			try {
				
				Connection con=ThingDao.getConnection();
				
				String sql="update  addpeople set  fullName =? , email =? ,dob =? , phone=? ,things_to_do=? ,idType =? ,idNumber =? where id=?";
				
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1,sb.getFullName());
				ps.setString(2,sb.getEmail());
				ps.setString(3,sb.getDob());
				ps.setString(4,sb.getPhone());
				ps.setString(5,sb.getThings_to_do());
				ps.setString(6,sb.getIdType());
				ps.setString(7,sb.getIdNumber());
				ps.setInt(8,sb.getId());
				
				status=ps.executeUpdate();
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			
			return status;
			
			
			
		}
		
		public static int deletePeopleData(int id)
		{
			
			int status=0;
			
			try {
				Connection con=ThingDao.getConnection();
				String sql="delete from addpeople where id=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				status=ps.executeUpdate();
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			return status;
			
		}
		
		
   public static int addthing(ThingInfoBo bb) {
			
			int status=0;
			
			
			try 
			{
				
				
				
				Connection con=ThingDao.getConnection();
				
				String sql="Insert into addthing (thingName,companyName,thingId) values(?,?,?) ";
				
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setString(1, bb.getThingName());
				ps.setString(2, bb.getCompanyName());
				ps.setString(3, bb.getThingId());
				
				status=ps.executeUpdate();
			}
			
			catch(Exception e) 
			{
				System.out.println(e);
				
			}
			
			return status;
			
			
		}
		
   public static List getThingData()
	{
		
		List <ThingInfoBo>list=new ArrayList<>();
		
		
		try
		{
			
			Connection con=ThingDao.getConnection();
			String sql="select * from addthing";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
				
			{
				
				ThingInfoBo bb=new ThingInfoBo();
				
				bb.setId(rs.getInt(1));
				bb.setThingName(rs.getString(2));
				bb.setCompanyName(rs.getString(3));
				bb.setThingId(rs.getNString(4));
				
				list.add(bb);
				
				
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
		
		
		
		return list;
		
		
	}
   
   public static ThingInfoBo getInfoByIdThing(int id)
	{
		ThingInfoBo bb=new ThingInfoBo();
		
		try {
			
			Connection con=ThingDao.getConnection();
			String sql="select * from addthing where id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				bb=new ThingInfoBo();
				
				bb.setId(rs.getInt(1));
				bb.setThingName(rs.getString(2));
               bb.setCompanyName(rs.getString(3));
				bb.setThingId(rs.getString(4));
				
				
				
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return bb;
		
	}
	
   public static int deleteThingData(int id)
	{
		
		int status=0;
		
		try {
			Connection con=ThingDao.getConnection();
			String sql="delete from addthing where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
		
	}
		
   public static int updateThing(ThingInfoBo bb)
	{
		int status=0;
		try {
			
			Connection con=ThingDao.getConnection();
			
			String sql="update  addthing set  thingName =? , companyName =? ,    thingId =? where id=?";
			
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,bb.getThingName());
			ps.setString(2,bb.getCompanyName());
			ps.setString(3,bb.getThingId());
			ps.setInt(4, bb.getId());
			
			status=ps.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		return status;
		
		
		
	}	
}
	


