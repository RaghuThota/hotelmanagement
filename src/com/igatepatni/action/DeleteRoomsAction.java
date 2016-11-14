package com.igatepatni.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.igatepatni.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteRoomsAction extends ActionSupport implements RequestAware
{

	
	Map<String, Object> application;
	private static final long serialVersionUID = 1L;
	List<String> roomList=new ArrayList<String>();
	 HotelService hotelService=new HotelService(); 	
	   

	 
		@Override 
	    public String execute(){ 
	            
	                
	    	roomList=hotelService.getroomId();
	        
	       application.put("list",roomList);
	       
	        
	            return SUCCESS; 
	        
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

}
