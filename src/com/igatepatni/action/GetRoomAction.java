package com.igatepatni.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.igatepatni.bean.Rooms;
import com.igatepatni.service.HotelService;
import com.igatepatni.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GetRoomAction extends ActionSupport implements RequestAware,ModelDriven
{
	/**
	 * 
	 */
	Map<String, Object> application;
	
	private static final long serialVersionUID = 1L;
	List<String> roomList=new ArrayList<String>();
	 RoomService roomService=new RoomService(); 
	 Rooms room=new Rooms();
	   

	 
		@Override 
	    public String execute(){ 
	            
	         
	    	roomList=roomService.getRoomId(room.getHotelId());
	        
	       application.put("list",roomList);
	     
	        if(roomList!=null)
	   
	            return SUCCESS; 
	        else
	        	return "input";
	        
	    }

		

		public List<String> getRoomList() {
			return roomList;
		}



		public void setRoomList(List<String> roomList) {
			this.roomList = roomList;
		}



		@Override
		public void setRequest(Map<String, Object> arg0) {
			// TODO Auto-generated method stub
			application=arg0;
		}



		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return room;
		}
		
}
