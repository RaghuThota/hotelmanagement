package com.igatepatni.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.igatepatni.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RetrieveForModifyRoomAction extends ActionSupport implements ModelDriven,SessionAware{

	Rooms room=new Rooms();
	Map session;
	HotelService hotelService=new HotelService();
	RoomService roomService=new RoomService();
	ArrayList<Rooms> bList=new ArrayList<Rooms>();
	String roomNo=null;
	
	@Override
	public String execute(){
		roomNo=room.getRoomId();
		bList=roomService.retrieveForModifyRoom(roomNo);
		if(bList!=null){
			
			session.put("list", bList);
			return SUCCESS;
		}else {
			
			return INPUT;
		}
		
	}
	
	@Override
	public Object getModel() {
		
		return room;
	}

	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}

}
