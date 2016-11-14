package com.igatepatni.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.bean.Booking;
import com.igatepatni.bean.Hotel;
import com.igatepatni.bean.Rooms;
import com.igatepatni.exceptions.InvalidBook;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookingStatusAction extends ActionSupport implements ModelDriven,SessionAware {

	Booking booking=new Booking();
	HotelService hotelService=new HotelService();
	List<Booking> bookingList=new ArrayList<Booking>();

	
	
	
	public List<Booking> getBookingList() {
		return bookingList;
	}


	public void setBookingList(List<Booking> bookingList) {
		this.bookingList = bookingList;
	}


	Map session;
	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}




	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	public HotelService getHotelService() {
		return hotelService;
	}


	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}


	public String execute() throws InvalidBook
	{
		String userId=(String) session.get("userId");
		System.out.println("in booking status"+userId);
		bookingList=hotelService.viewBookingStatus(userId);
		
		if(bookingList.size()>0)
		{
			session.put("bookList", bookingList);
			return SUCCESS;
		}
		else
		{
			 throw new InvalidBook("You dont have any bookings right now");
		    //return ERROR;
		}
	}
	
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return booking;
	}



}
