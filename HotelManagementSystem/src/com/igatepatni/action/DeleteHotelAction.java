package com.igatepatni.action;

import com.igatepatni.bean.Hotel;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeleteHotelAction extends ActionSupport implements ModelDriven{

	Hotel hotel=new Hotel();
	HotelService hotelService=new HotelService();
	String hotelNo=null;
	int result=0;
	
	@Override
	public String execute(){
		
		hotelNo=hotel.getHotelId();
		result=hotelService.deleteHotel(hotelNo);
		if(result>0)
			return SUCCESS;
		else
			return ERROR;
	}
	
	@Override
	public Object getModel() {
		
		return hotel;
	}

}
