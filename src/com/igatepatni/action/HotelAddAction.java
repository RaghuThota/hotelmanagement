package com.igatepatni.action;

import com.igatepatni.bean.Hotel;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



public class HotelAddAction  extends ActionSupport implements ModelDriven
{
	Hotel hotel = new Hotel();
    HotelService hotelService=new HotelService();
    int result=0;

     @Override
public String execute(){
	
	result=hotelService.addHotel(hotel);
	if(result>0)
		return "success";
	else {
		return "input";
	}
		
	
	
}

@Override
public Object getModel() {
	
	return hotel;
}


}
