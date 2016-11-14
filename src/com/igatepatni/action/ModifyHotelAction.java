package com.igatepatni.action;

import java.util.ArrayList;
import java.util.List;

import com.igatepatni.bean.Hotel;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ModifyHotelAction extends ActionSupport implements ModelDriven
{
	Hotel hotel=new Hotel();
	HotelService hotelService=new HotelService();
	//ModifyService service=new ModifyService();
	List<Hotel> list=new ArrayList<Hotel>();
	
	
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
