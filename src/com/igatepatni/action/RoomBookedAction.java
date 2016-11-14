package com.igatepatni.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.bean.Booking;
import com.igatepatni.bean.Hotel;
import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RoomBookedAction extends ActionSupport implements ModelDriven,SessionAware{

	
	Hotel hotel = new Hotel();
	Booking book=new Booking();
	Map session;
	
	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}


	HotelService hotelService=new HotelService();
	List<Rooms> roomTypeList=new ArrayList<Rooms>();
	
	public Hotel getHotel() {
		return hotel;
	}


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	public HotelService getHotelService() {
		return hotelService;
	}


	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}


	public List<Rooms> getRoomTypeList() {
		return roomTypeList;
	}


	public void setRoomTypeList(List<Rooms> roomTypeList) {
		this.roomTypeList = roomTypeList;
	}


	@Override
	public String execute(){
		
		roomTypeList=hotelService.searchRoomType();
		
		book=hotelService.bookRoomForUser(book);
		
		
		
		
		
		if(book.getAmount()!=0.0)
		{
			session.put("bookingId", book.getBookingId());
			session.put("userId", book.getUserId());
			session.put("bookingId", book.getBookingId());
			session.put("fromDate", book.getFromDate());
			session.put("toDate", book.getToDate());
			session.put("amount", book.getAmount());
			
			return SUCCESS;
		}
			else
			return ERROR;
	}
	
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return book;
	}
	

}
