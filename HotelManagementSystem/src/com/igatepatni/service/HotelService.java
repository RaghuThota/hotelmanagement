package com.igatepatni.service;

import java.util.ArrayList;

import com.igatepatni.bean.Hotel;
import com.igatepatni.bean.Rooms;
import com.igatepatni.dao.HotelDao;


public class HotelService 
{
	HotelDao hotelDao=new HotelDao();
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
	public int addRooms(Rooms room) {
		
		return hotelDao.addRooms(room);
	}
	public int deleteRooms(String roomNo) {
		return hotelDao.deleteRooms(roomNo);
	}
	public ArrayList<Rooms> retrieveForModifyRoom(String roomNo) 
	{
		return hotelDao.retrieveForModifyRoom(roomNo);
	}
	public void modifyRoom(Rooms room) 
	{
		
		hotelDao.modifyRoom(room);
	}
}
