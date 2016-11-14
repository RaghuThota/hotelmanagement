package com.igatepatni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.igatepatni.bean.Hotel;
import com.igatepatni.bean.Rooms;

public class HotelDao 
{
	DBConnection dbConnection=new DBConnection();
	public int addHotel(Hotel hotel)
	{
		Connection con = dbConnection.getConnection();
		int res = 0;
		String sql1 = "insert into hotel_table values(sequence_hotelId_table.nextval,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setString(1, hotel.getCity());
			ps.setString(2, hotel.getHotelName());
			ps.setString(3, hotel.getAddress());
			ps.setString(4, hotel.getDescription());
			ps.setDouble(5, hotel.getAvg_rate_night());
			ps.setString(6, hotel.getPhoneNo1());
			ps.setString(7, hotel.getPhoneNo2());
			ps.setString(8, hotel.getRating());
			ps.setString(9, hotel.getEmail());
			ps.setString(10, hotel.getFax());

			System.out.println("hai in add");
			res = ps.executeUpdate();
			System.out.println(res);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}
	public ArrayList<Hotel> retrieveForModify(String hotelNo) 
	{
		Connection con = dbConnection.getConnection();
		Hotel hotel=null;
		ArrayList<Hotel> bList=new ArrayList<Hotel>();
		String sql1 = "select * from hotel_table where hotel_id=?";
		ResultSet rs=null;
		System.out.println("IN DAO list");
		try {
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, hotelNo);
			rs=ps1.executeQuery();

			while(rs.next())
			{
				hotel=new Hotel();

				hotel.setHotelId(rs.getString(1));
				hotel.setCity(rs.getString(2));
				hotel.setHotelName(rs.getString(3));
				hotel.setAddress(rs.getString(4));
				hotel.setDescription(rs.getString(5));
				hotel.setAvg_rate_night(rs.getDouble(6));
				hotel.setPhoneNo1(rs.getString(7));
				hotel.setPhoneNo2(rs.getString(8));
				hotel.setRating(rs.getString(9));
				hotel.setEmail(rs.getString(10));
				hotel.setFax(rs.getString(11));
				bList.add(hotel);

			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return bList;
		
	}
	public void modifyHotel(Hotel hotel) 
	{
		Connection con=dbConnection.getConnection();
		int res1 = 0;
		String sql1 = "update hotel_table set city=?,hotel_name=?,address=?,description=?,avg_rate_per_night=?,phone_no1=?,phone_no2=?,rating=?,email=?,fax=? where hotel_id=?";

		System.out.println("IN DAOmmmm");
		try {
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, hotel.getCity());
			ps1.setString(2, hotel.getHotelName());
			ps1.setString(3, hotel.getAddress());
			ps1.setString(4, hotel.getDescription());
			ps1.setDouble(5, hotel.getAvg_rate_night());
			ps1.setString(6, hotel.getPhoneNo1());
			ps1.setString(7, hotel.getPhoneNo2());
			ps1.setString(8, hotel.getRating());
			ps1.setString(9, hotel.getEmail());
			ps1.setString(10, hotel.getFax());
			ps1.setString(11, hotel.getHotelId());

			res1 = ps1.executeUpdate();

			System.out.println(res1);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	public int deleteHotel(String hotelNo) 
	{
	
		Connection con = dbConnection.getConnection();

		int delete = 0;
		String query = "delete from hotel_table where hotel_id=?";
		System.out.println("IN DAO DELETE");
		try
		{
			PreparedStatement ps1 = con.prepareStatement(query);
			ps1.setString(1, hotelNo);
			delete = ps1.executeUpdate();

		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return delete;
	}
	public ArrayList<Hotel> retrieveHotel() 
	{
		Connection con = dbConnection.getConnection();
		Hotel hotel=null;
		ArrayList<Hotel> hList=new ArrayList<Hotel>();
		String sql1 = "select * from hotel_table";
		ResultSet rs=null;
		System.out.println("IN DAO list");
		try {
			PreparedStatement ps1 = con.prepareStatement(sql1);
			rs=ps1.executeQuery();

			while(rs.next())
			{
				hotel=new Hotel();

				hotel.setHotelId(rs.getString(1));
				hotel.setCity(rs.getString(2));
				hotel.setHotelName(rs.getString(3));
				hotel.setAddress(rs.getString(4));
				hotel.setDescription(rs.getString(5));
				hotel.setAvg_rate_night(rs.getDouble(6));
				hotel.setPhoneNo1(rs.getString(7));
				hotel.setPhoneNo2(rs.getString(8));
				hotel.setRating(rs.getString(9));
				hotel.setEmail(rs.getString(10));
				hotel.setFax(rs.getString(11));

				hList.add(hotel);

			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return hList;

	}
	public int addRooms(Rooms room) {
		Connection con = dbConnection.getConnection();
		int res=0;
		System.out.println("availabilty"+room.getAvailability());
		String sql1 = "insert into room_table values(?,sequence_roomId_table.nextval,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setString(1,room.getHotelId());
			//ps.setString(2,room.getRoomId());
			ps.setString(2,room.getRoomNo());
			ps.setString(3,room.getRoomType());
			ps.setDouble(4,room.getPerNightRate());
			ps.setString(5,room.getAvailability());
			res=ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally
		{
			try {

				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return res;
	}
	public int deleteRooms(String roomNo) {

		Connection con = dbConnection.getConnection();

		int res1 = 0;
		String sql1 = "delete from room_table where room_id=?";
		System.out.println("IN DAO DELETE");
		try {
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, roomNo);
			res1 = ps1.executeUpdate();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return res1;
	}
	public ArrayList<Rooms> retrieveForModifyRoom(String roomNo) {
		Connection con = dbConnection.getConnection();
		Rooms room=null;
		ArrayList<Rooms> bList=new ArrayList<Rooms>();
		String sql1 = "select * from room_table where room_id=?";
		ResultSet rs=null;
		System.out.println("IN DAO list");
		try {
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
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return bList;
	}
	public void modifyRoom(Rooms room) 
	{
		
		Connection con=dbConnection.getConnection();
		int res1 = 0;
		String sql1 = "update room_table set room_no=?,room_type=?,per_night_rate=?,availability=? where room_id=?";

		System.out.println("IN DAOmmmm");
		try {
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, room.getRoomNo());
			ps1.setString(2, room.getRoomType());
			ps1.setDouble(3, room.getPerNightRate());
			ps1.setString(4, room.getAvailability());
			ps1.setString(5, room.getRoomId());

			res1 = ps1.executeUpdate();

			System.out.println(res1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		//return res1;
	}
}
