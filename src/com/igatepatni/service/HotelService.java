package com.igatepatni.service;

import java.util.ArrayList;
import java.util.List;

import com.igatepatni.bean.Booking;
import com.igatepatni.bean.Hotel;
import com.igatepatni.bean.LoginBean;
import com.igatepatni.bean.Rooms;
import com.igatepatni.bean.ViewDate;
import com.igatepatni.dao.HotelDao;
import com.igatepatni.dao.RoomDao;
import com.sun.org.apache.bcel.internal.generic.NEW;


public class HotelService 
{
	HotelDao hotelDao=new HotelDao();
	RoomDao	roomDao=new RoomDao();
	public int addHotel(Hotel hotel) {

		return hotelDao.addHotel(hotel);
		
	}
	public ArrayList<Hotel> retrieveForModify(String hotelNo) 
	{
		
		return hotelDao.retrieveForModify(hotelNo);
	}
	public void modifyHotel(Hotel hotel) 
	{
		hotelDao.modifyHotel(hotel);	
	 	
	}
	public int deleteHotel(String hotelNo) 
	{
		return hotelDao.deleteHotel(hotelNo);
	}
	public ArrayList<Hotel> retrieveHotel() 
	{
		
		return hotelDao.retrieveHotel();
	}
	
	
	public List<String> gethotelId() {
		// TODO Auto-generated method stub
		return hotelDao.gethotelId();
	}
	public List<String> getroomId() {
		// TODO Auto-generated method stub
		return roomDao.getroomId();
	}
	
	public List<Hotel> searchHotelNames() 
	{
		return hotelDao.searchHotelNames();
	}
	
	public List<Rooms> searchRoomType() 
	{
		return hotelDao.searchRoomType();
		
	}
	public Rooms selectRoomType(Rooms room) 
	{
		return hotelDao.selectRoomType(room);
	}
	public List<Rooms> searchRoomTypeByHotel(String hotelId) 
	{
		return hotelDao.searchRoomTypeByHotel(hotelId);
	}
	public Booking bookRoomForUser(Booking book) 
	{
		return hotelDao.bookRoomForUser(book);
	}
	public List<Booking> viewBookingStatus(String userId) 
	{
		return hotelDao.viewBookingStatus(userId);
	
	}
	public List<Hotel> gethotelName() {
		// TODO Auto-generated method stub
		return hotelDao.searchHotelNames();
	}
	public ArrayList<Booking> DisplayGuestList(String hotelId) {
		// TODO Auto-generated method stub
		return hotelDao.DisplayGuestList(hotelId);
	}
	public ArrayList<LoginBean> getGuestList(String hotelId) {
		// TODO Auto-generated method stub
		return hotelDao.getGuestList(hotelId);
	}
	public ArrayList<ViewDate> getDateList(ViewDate viewDate) 
	{
		return hotelDao.getDateList(viewDate); 
		
	}
	public String getDescription(String hotelId) 
	{
		return hotelDao.getDescription(hotelId); 
	}
}
