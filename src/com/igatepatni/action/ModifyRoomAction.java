package com.igatepatni.action;

import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.igatepatni.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModifyRoomAction extends ActionSupport implements ModelDriven{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Rooms room=new Rooms();
	
	HotelService hotelService=new HotelService();
	RoomService roomService=new RoomService();
	
	@Override
	public String execute(){
		
		int roomSuccess=roomService.modifyRoom(room);
		if(roomSuccess==1)
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
}
