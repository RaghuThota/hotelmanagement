package com.igatepatni.action;

import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeleteRoomAction extends ActionSupport implements ModelDriven{

	Rooms room=new Rooms();
	HotelService hotelService=new HotelService();
	String roomNo=null;
	int result=0;
	
	@Override
	public String execute(){
		
		roomNo=room.getRoomId();
		result=hotelService.deleteRooms(roomNo);
		if(result>0)
			return SUCCESS;
		else
			return ERROR;
		
	}
	
	@Override
	public Object getModel() {
		
		return room;
	}

}
