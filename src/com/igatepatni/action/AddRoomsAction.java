package com.igatepatni.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.igatepatni.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class AddRoomsAction extends ActionSupport implements ModelDriven{

	Rooms room=new Rooms(); 
	HotelService hotelService=new HotelService(); 
	RoomService roomService=new RoomService();
    int result=0;
    List<String> hotelList=new ArrayList<String>();
    Map session;
	
    public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	@Override 
    public String execute(){ 
            
        System.out.println(room.getHotelId());
        
        result=roomService.addRooms(room); 
        //session.put("key",result);
        if(result>0)
        {
        	
            return SUCCESS; 
        }
        else
        return INPUT;
    } 
    
    @Override 
    public Object getModel() { 
            
            return room; 
    }

	
	

	public List<String> getHotelList() {
		return hotelList;
	}

	public void setHotelList(List<String> hotelList) {
		this.hotelList = hotelList;
	}


}
