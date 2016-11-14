package com.igatepatni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.igatepatni.bean.Rooms;
import org.apache.log4j.Logger;
public class RoomDao {
	DBConnection dbConnection=new DBConnection();
	
	Logger logger = Logger.getLogger(Logger.class);	
	
	public int addRooms(Rooms room) {
		Connection con = dbConnection.getConnection();
		int res=0;
		
		
		
		
		try 
		{
			String sql2 = "insert into photo_table values(sequence_photo.nextval,?)";
			PreparedStatement pst = con.prepareStatement(sql2);
			pst.setString(1, room.getPhotoPath());
			int r=pst.executeUpdate();
			System.out.println("sdfsf"+r);
			logger.info("inserted  successfully into photo_table");
			
			String sql1 = "insert into room_table values(?,sequence_roomId_table.nextval,?,?,?,?,sequence_photo.currval)";
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setString(1,room.getHotelId());
			//ps.setString(2,room.getRoomId());
			ps.setString(2,room.getRoomNo());
			ps.setString(3,room.getRoomType());
			ps.setDouble(4,room.getPerNightRate());
			ps.setString(5,room.getAvailability());
			
			res=ps.executeUpdate();
			logger.info("inserted  successfully into room_table");
		}
		catch (SQLException e) 
		{

			logger.error("Error while inserting into room_table");
		}
		finally
		{
			try {

				con.close();
			} 
			catch (SQLException e) {

				logger.error("Error while Closing the connection");
			}
		}
		return res;
	}
	
	public int deleteRooms(String roomNo) {

		Connection con = dbConnection.getConnection();

		int res1 = 0;
		String sql1 = "delete from room_table where room_no=?";
		
		try 
		{
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1,roomNo);
			res1 = ps1.executeUpdate();
			logger.info("Deleted successfully");	
		}
		catch (SQLException e)
		{
			logger.error("Error while deleting from room_table");
		}
		finally
		{
			try 
			{

				con.close();
			} 
			catch (SQLException e) 
			{

				logger.error("Error while Closing the connection");
			}
		}
		return res1;
	}
	
	
	public List<String> getroomId() 
	{
	
			Connection con=dbConnection.getConnection();
			List<String> list=new ArrayList<String>();
			String sql1 ="select room_id from room_table";
			ResultSet rs=null;
			try 
			{
				PreparedStatement ps1 = con.prepareStatement(sql1);
				rs=ps1.executeQuery();
				while(rs.next())
				{
					list.add(rs.getString(1));
				}
				logger.info("RoomID retrieved successfully");	
			}
			catch(SQLException e)
			{
				logger.error("Error while retriving from room_table");
			}
			finally
			{
				try 
				{

					con.close();
				} 
				catch (SQLException e) 
				{

					logger.error("Error while Closing the connection");
				}
			}		
			return list;
		
	}
	
	
	public ArrayList<Rooms> retrieveForModifyRoom(String roomNo) 
	{
		Connection con = dbConnection.getConnection();
		Rooms room=null;
		ArrayList<Rooms> bList=new ArrayList<Rooms>();
		String sql1 = "select * from room_table where room_id=?";
		ResultSet rs=null;
	
		try 
		{
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, roomNo);
			rs=ps1.executeQuery();

			while(rs.next())
			{
				room=new Rooms();
				room.setHotelId(rs.getString(1));
				room.setRoomId(rs.getString(2));
				room.setRoomNo(rs.getString(3));
				room.setRoomType(rs.getString(4));
				room.setPerNightRate(rs.getDouble(5));
				room.setAvailability(rs.getString(6));
				bList.add(room);

			}
			logger.info("Rooms retrieved from room_table");	
		}
		catch (SQLException e) 
		{
			logger.error("Error while Rooms retrieved from room_table");
		}
		finally
		{
			try 
			{

				con.close();
			} 
			catch (SQLException e) 
			{

				logger.error("Error while Closing the connection");
			}
		}
		return bList;
	}
	public int modifyRoom(Rooms room) 
	{
		
		Connection con=dbConnection.getConnection();
		int res1 = 0;
		String sql1 = "update room_table set room_no=?,room_type=?,per_night_rate=?,availability=? where room_id=?";

		
		try 
		{
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, room.getRoomNo());
			ps1.setString(2, room.getRoomType());
			ps1.setDouble(3, room.getPerNightRate());
			ps1.setString(4, room.getAvailability());
			ps1.setString(5, room.getRoomId());

			res1 = ps1.executeUpdate();
			if(res1>0)
				res1=1;
			else
				res1=0;

			logger.info("Updated successfully");
		}
		catch (SQLException e) 
		{
			logger.error("Error while updating room details");
		}
		finally
		{
			try 
			{

				con.close();
			} 
			catch (SQLException e) 
			{

				logger.error("Error while Closing the connection");
			}
		}
		return res1;
	}

	public List<String> getroomId(String roomId) 
	{
	
		Connection con=dbConnection.getConnection();
		List<String> list=new ArrayList<String>();
		String sql1 ="select room_no from room_table  where hotel_id=?";
		ResultSet rs=null;
		try 
		{
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, roomId);
			rs=ps1.executeQuery();
			while(rs.next())
			{	
				list.add(rs.getString(1));
			}
		}
		catch(SQLException e)
		{
			logger.error("Error while updating room details");
		}
		finally
		{
			try 
			{

				con.close();
			} 
			catch (SQLException e) 
			{

				logger.error("Error while Closing the connection");
			}
		}
		return list;
	
		
	}

}
