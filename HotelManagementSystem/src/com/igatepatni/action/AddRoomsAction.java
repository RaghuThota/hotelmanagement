package com.igatepatni.action;


import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddRoomsAction extends ActionSupport implements ModelDriven{

	Rooms room=new Rooms(); 
	HotelService hotelService=new HotelService(); 
    int result=0;
	
    @Override 
    public String execute(){ 
            
        System.out.println(room.getHotelId());
        
        result=hotelService.addRooms(room); 
        if(result>0)
            return SUCCESS; 
        return INPUT;
    } 
    
    @Override 
    public Object getModel() { 
            
            return room; 
    }


}
