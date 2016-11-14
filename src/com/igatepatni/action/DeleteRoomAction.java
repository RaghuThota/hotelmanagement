package com.igatepatni.action;

import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.igatepatni.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeleteRoomAction extends ActionSupport implements ModelDriven{

	Rooms room=new Rooms();
	RoomService roomService=new RoomService();
	String roomNo=null;
	int result=0;
	
	@Override
	public String execute(){
		
		roomNo=room.getRoomNo();
		System.out.println(roomNo);
		result=roomService.deleteRooms(roomNo);
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
