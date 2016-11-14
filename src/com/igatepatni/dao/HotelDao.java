package com.igatepatni.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.igatepatni.bean.Booking;
import com.igatepatni.bean.Hotel;
import com.igatepatni.bean.LoginBean;
import com.igatepatni.bean.Rooms;
import com.igatepatni.bean.ViewDate;

public class HotelDao 
{
	DBConnection dbConnection=new DBConnection();
	Logger logger = Logger.getLogger(Logger.class);	
	public int addHotel(Hotel hotel)
	{
		Connection con = dbConnection.getConnection();
		int res = 0;
		int res1=0;
		String sql1 = "insert into hotel_table values(sequence_hotelId_table.nextval,?,?,?,?,?,?,?,?,?,?)";

		try 
		{
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

			
			res = ps.executeUpdate();
			logger.info("New Hotel details added successfully");
			
		} catch (SQLException e)
		{
			logger.error("Error while inserting new hotel");
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

		return res;
	}
	public ArrayList<Hotel> retrieveForModify(String hotelNo) 
	{
		Connection con = dbConnection.getConnection();
		Hotel hotel=null;
		ArrayList<Hotel> bList=new ArrayList<Hotel>();
		String sql1 = "select * from hotel_table where hotel_id=?";
		ResultSet rs=null;
		
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
				logger.info(hotel.getHotelName()+" details retrieved successfully");
			}
		}
		catch (SQLException e) 
		{
			logger.error("Error while selecting of hotel details");
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
	public void modifyHotel(Hotel hotel) 
	{
		Connection con=dbConnection.getConnection();
		int res1 = 0;
		String sql1 = "update hotel_table set city=?,hotel_name=?,address=?,description=?,avg_rate_per_night=?,phone_no1=?,phone_no2=?,rating=?,email=?,fax=? where hotel_id=?";

		
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

			logger.info(hotel.getHotelName()+" details updated successfully");	
		}
		catch (SQLException e) 
		{
			logger.error("Error while updation of hotel details");	
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
	}
	public int deleteHotel(String hotelNo) 
	{
	
		Connection con = dbConnection.getConnection();

		int delete = 0;
		String query = "delete from hotel_table where hotel_id=?";
		
		try
		{
			PreparedStatement ps1 = con.prepareStatement(query);
			ps1.setString(1, hotelNo);
			delete = ps1.executeUpdate();
			logger.info(hotelNo+" deleted successfully");	
		}
		catch (SQLException e) 
		{
			logger.error("Error while deletion of hotel details");	
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
		return delete;
	}
	public ArrayList<Hotel> retrieveHotel() 
	{
		Connection con = dbConnection.getConnection();
		Hotel hotel=null;
		ArrayList<Hotel> hList=new ArrayList<Hotel>();
		String sql1 = "select * from hotel_table";
		ResultSet rs=null;
		
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
				logger.info("Hotel details retrieved successfully");	
			}
		}
		catch (SQLException e) 
		{
			logger.error("Error while retrieval of hotel details");	
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
		return hList;

	}
	
	
	public List<String> gethotelId() {
		// TODO Auto-generated method stub
		Connection con=dbConnection.getConnection();
		List<String> list=new ArrayList<String>();
		String sql1 ="select hotel_id from hotel_table";
		ResultSet rs=null;
		try {
			PreparedStatement ps1 = con.prepareStatement(sql1);
			rs=ps1.executeQuery();
			while(rs.next())
			{
				list.add(rs.getString(1));
			}
			logger.info("Retreived succesfully in gethotelId()");
		}catch(SQLException e)
		{
			logger.error("Error while retrieval of hotel details in gethotelId()");	
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
//customer employee operations*******
	public List<Hotel> searchHotelNames() 
	{
		List<Hotel> reqlist=new ArrayList<Hotel>();
		Connection con=dbConnection.getConnection();
		String sql="select hotel_id,hotel_name from hotel_table";
		try {
			Statement stmt=con.createStatement();
			ResultSet rset=stmt.executeQuery(sql);
			while(rset.next())
			{
				Hotel req=new Hotel();
				req.setHotelId(rset.getString(1));
				req.setHotelName(rset.getString(2));
				
				reqlist.add(req);
				logger.info("Retreived succesfully in searchHotelNames() ");
			}

		} catch (SQLException e)
		{
			logger.error("Error while retrieval of hotel details in searchHotelNames()");	
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
		return reqlist;
	}
	public Rooms selectRoomType(Rooms room) 
	{
		Connection con=dbConnection.getConnection();
		
		Rooms room1=new Rooms();

		try
		{
			String hotelId=room.getHotelId();
			String roomType=room.getRoomType();

			

			String Query1="select distinct room_no,room_type,availability,room_id from room_table where room_type like ? and hotel_id=?";
			PreparedStatement pst=con.prepareStatement(Query1);
			pst.setString(1,roomType);
			pst.setString(2,hotelId);

			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				room1.setRoomNo(rs.getString(1));
				room1.setRoomType(rs.getString(2));
				room1.setAvailability(rs.getString(3));
				room1.setRoomId(rs.getString(4));
				
				logger.info("Retreived succesfully in selectRoomType() ");

			}

			//System.out.println("type is "+str);
		}
		catch(Exception e)
		{
			logger.error("Error while retrieval of hotel details in selectRoomType()");
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


	

		return room1;
	}
	public List<Rooms> searchRoomType() 
	{
		List<Rooms> reqlist=new ArrayList<Rooms>();
		Connection con=dbConnection.getConnection();
	
		String sql="select distinct hotel_id,room_type from room_table where availability='yes'";
		try {
			Statement stmt=con.createStatement();
			ResultSet rset=stmt.executeQuery(sql);
			
			while(rset.next())
			{
				Rooms req=new Rooms();
				req.setHotelId(rset.getString(1));
				req.setRoomType(rset.getString(2));
				
				reqlist.add(req);
				logger.info("Retreived succesfully in searchRoomType()  ");
			}

		} catch (SQLException e) 
		{
			logger.error("Error while retrieval of hotel details in searchRoomType()");	
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
		return reqlist;
	}
	public List<Rooms> searchRoomTypeByHotel(String hotelId) 
	{
		
		List<Rooms> reqlist=null;
		Connection con=dbConnection.getConnection();
		
		int hoteId=Integer.parseInt(hotelId);
		
		String sql="select distinct room_type from room_table where availability='yes' and hotel_id="+hoteId;
		try {
			Statement stmt=con.createStatement();
			ResultSet rset=stmt.executeQuery(sql);
			reqlist=new ArrayList<Rooms>();
			
			while(rset.next())
			{	
				Rooms req=new Rooms();
				
				req.setRoomType(rset.getString(1));
				
				reqlist.add(req);
				
			}
			logger.info("Retreived succesfully in searchRoomTypeByHotel()");
		} catch (SQLException e) {
			logger.error("Error while retrieval of hotel details in searchRoomType()");
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
		
		return reqlist;
	}
	public Booking bookRoomForUser(Booking book) 
	{

		Connection con=dbConnection.getConnection();
	
	

		try
		{
	
			int bookingId=book.getBookingId();
			

			int adults=book.getNoOfAdults();
			int children=book.getNoOfChildren();

			java.util.Date from=null;
			java.util.Date  to=null;            
			//Date from=toDate(book.getFromDate());;
			// Date to=(Date) book.getToDate();

			// String str_date=str;

			DateFormat formatter ; 



			formatter = new SimpleDateFormat("dd/mm/yyyy");

			from =  formatter.parse(book.getFromDate());  
			to =  formatter.parse(book.getToDate());



			int noOfDays=(int)(to.getTime()-from.getTime())/(1000 * 60 * 60 * 24);

			int roomId=book.getRoomId();
			Double perNightAvg=0.0;



			String Query1="select PER_NIGHT_RATE from room_table where room_id=?";
			
			PreparedStatement pst=con.prepareStatement(Query1);


			pst.setInt(1,roomId);

			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				perNightAvg=rs.getDouble(1);
				//room1.setRoomType(rs.getString(1));
				//room1.setAvailabilty(rs.getString(2));
				//room1.setRoomId(rs.getString(3));
				//System.out.println("In rs.next()"+rs.getString(1));
			}

			double amount=perNightAvg*noOfDays*adults+(perNightAvg*noOfDays*children)/2;

			
			String Query2="insert into booking_table values(sequence_bookingId_table.nextval,?,?,to_date(?,'dd/mm/yyyy'),to_date(?,'dd/mm/yyyy'),?,?,?)";
			PreparedStatement pst1=con.prepareStatement(Query2);

			//pst1.setString(1,book.getBookingId());
			pst1.setInt(1,book.getRoomId());
			pst1.setInt(2,book.getUserId());

			pst1.setString(3, book.getFromDate());
			pst1.setString(4,book.getToDate());
			pst1.setInt(5, book.getNoOfAdults());
			pst1.setInt(6, book.getNoOfChildren());
			pst1.setDouble(7, amount);
			int res;

			String res1="";
			int booking_id=0;
			//ResultSet rs1=pst1.executeQuery();
			res=pst1.executeUpdate();
			if (res > 0) 
			{
				String sql2 = "select sequence_bookingId_table.currval from dual";
				PreparedStatement ps1 = con.prepareStatement(sql2);
				ResultSet rs2 = null;
				rs2 = ps1.executeQuery();
				rs2.next();

				booking_id = rs2.getInt(1);
				

			}

			//book.setBookingId(bookingId);
			book.setAmount(amount);
			book.setBookingId(booking_id);
			//book.setUserId(userId);


			logger.info("inserted  succesfully into booking_table");
			//System.out.println("type is "+str);
		}
		catch(Exception e)
		{
			logger.error("Error while inserting into booking_table");	
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


		return book;	
	}
	public List<Booking> viewBookingStatus(String userId) 
	{
		List<Booking> bookingList=new ArrayList<Booking>();
		Connection con=dbConnection.getConnection();
		
		
		String sql="select * from booking_table where user_id='"+userId+"' and BOOKED_TO >(select sysdate from dual)";
		try {
			Statement stmt=con.createStatement();
			ResultSet rset=stmt.executeQuery(sql);
			
			while(rset.next())
			{
				Booking booking = new Booking();
			
				booking.setBookingId(rset.getInt(1));
				booking.setRoomId(rset.getInt(2));
				booking.setUserId(rset.getInt(3));
				booking.setFromDate(rset.getString(4));
				booking.setToDate(rset.getString(5));
				booking.setNoOfAdults(rset.getInt(6));
				booking.setNoOfChildren(rset.getInt(7));
				booking.setAmount(rset.getDouble(8));
				
				bookingList.add(booking);
				logger.info("Viewing booking details by "+userId);
			}

		} catch (SQLException e) 
		{
			logger.error("Error while viewing booking status");	
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
		return bookingList;
	}
	public ArrayList<Booking> DisplayGuestList(String hotelId) {
		// TODO Auto-generated method stub
		Connection con=dbConnection.getConnection();
		
		ArrayList<Booking> list=new ArrayList<Booking>();
		String sql1 = "select booking.booking_id,booking.room_id,booking.user_id,booking.booked_from,booking.booked_to,booking.no_of_adults,booking.no_of_children,booking.amount" +
						" from booking_table booking,hotel_table hotel,room_table room " +
					"where hotel.hotel_id=room.hotel_id and" +
					" booking.room_id = room.room_id and " +
					"hotel.hotel_id= ? ";
		ResultSet rs=null;
		try {
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, hotelId);
			rs=ps1.executeQuery();
			while(rs.next())
			{
				Booking booking=new Booking();
				booking.setBookingId(rs.getInt(1));
				booking.setRoomId(rs.getInt(2));
				booking.setUserId(rs.getInt(3));
				booking.setFromDate(rs.getString(4));
				booking.setToDate(rs.getString(5));
				booking.setNoOfAdults(rs.getInt(6));
				booking.setNoOfChildren(rs.getInt(7));
				booking.setAmount(rs.getDouble(8));
				list.add(booking);
			}
			logger.info("retrieved data successfully");
			
		}catch(SQLException e)
		{
			logger.error("Error while retreiving details");	
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
	public ArrayList<LoginBean> getGuestList(String hotelId) 
	{
		// TODO Auto-generated method stub
		Connection con=dbConnection.getConnection();
		ArrayList<LoginBean> list=new ArrayList<LoginBean>();
		
		String sql1 = "select users.user_id,users.user_name,users.phone,users.mobile_no,users.address,users.email from users_table users,booking_table booking,hotel_table hotel,room_table room where users.user_id= booking.user_id and hotel.hotel_id=room.hotel_id and booking.room_id= room.room_id and hotel.hotel_id=?";
		
		ResultSet rs=null;
		try {
			
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, hotelId);
			
			rs=ps1.executeQuery();
			
			
			while(rs.next())
			{
				LoginBean login=new LoginBean();
				login.setUserId(rs.getString(1));
				login.setUserName(rs.getString(2));
				login.setMobNo(rs.getString(4));
				login.setPhNo(rs.getString(3));
				login.setAddress(rs.getString(5));
				login.setEmail(rs.getString(6));
				list.add(login);
				
				
			}
			
			logger.info("retrieved data successfully in getGuestList()");
		}
		catch(SQLException e)
		{
			logger.error("Error while viewing booking status");	
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
	public ArrayList<ViewDate> getDateList(ViewDate viewDate) 
	{
		Connection con=dbConnection.getConnection();
		ArrayList<ViewDate> dateList=new ArrayList<ViewDate>();
		
	
		
		
		
	/*	String date[]=viewDate.getFromDate().split("/");
		int day=Integer.parseInt(date[2]);
		int month=Integer.parseInt(date[1]);
		int year=Integer.parseInt(date[0]);
		Date date1=new Date(year-1900,month-1,day);
		System.out.println("Date is"+date1);
		
		System.out.println("im coming to dao");*/
		ResultSet rs=null;
		try {

			/*java.util.Date from=null;
			DateFormat formatter ; 


			formatter = new SimpleDateFormat("dd/mm/yyyy");
			from =  formatter.parse(viewDate.getFromDate());*/

			
			String sql1 = "select hotel.hotel_name,hotel.hotel_id,room.room_no,room.room_type,hotel.city from hotel_table hotel,room_table room  where hotel.hotel_id=room.hotel_id AND room.room_id in (select room_id from booking_table where booked_from =to_date(?,'dd/mm/yyyy') OR ( booked_from < to_date(?,'dd/mm/yyyy') AND  booked_to>to_date(?,'dd/mm/yyyy')))";
			PreparedStatement ps1 = con.prepareStatement(sql1);
			
			ps1.setString(1, viewDate.getFromDate());
			ps1.setString(2, viewDate.getFromDate());
			ps1.setString(3, viewDate.getFromDate());
			
			//ps1.setDate(1,date1);
			//ps1.setDate(2,date1);
			//ps1.setDate(3,date1);
		
			rs=ps1.executeQuery();
			
			
			while(rs.next())
			{
				
				Booking book=new Booking();
				viewDate.setHotelName(rs.getString(1));
				viewDate.setHotelId(rs.getString(2));
				viewDate.setRoomNo(rs.getInt(3));
				viewDate.setRoomType(rs.getString(4));
				viewDate.setCity(rs.getString(5));
				
				dateList.add(viewDate);
			
				
			}
			
			logger.info("retrieved data successfully in getDateList()");
		}
		catch(Exception e)
		{
			logger.error("Error while viewing booking status");	
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
		return dateList;
	
	}
	public String getDescription(String hotelId) 
	{
		
		String decription="";
		Connection con=dbConnection.getConnection();

		String sql="select DESCRIPTION  from hotel_table where hotel_id="+hotelId;
		try {
			Statement stmt=con.createStatement();
			ResultSet rset=stmt.executeQuery(sql);
			
			while(rset.next())
			{
				decription=rset.getString(1);
			}
			logger.info("Retreived succesfully in getDescription()");
		} 
		catch (SQLException e) 
		{
			logger.error("Error while retrieval of hotel details in getDescription()");	
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
		return decription;
	}
	
}
