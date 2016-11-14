package com.igatepatni.action;

import com.igatepatni.bean.Hotel;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModifyHotelAction extends ActionSupport implements ModelDriven
{
	Hotel hotel=new Hotel();
	HotelService hotelService=new HotelService();
	
	@Override
	public String execute(){
		
		hotelService.modifyHotel(hotel);
		return SUCCESS;
	}
	
	@Override
	public Object getModel() {
		
		return hotel;
	}

}
