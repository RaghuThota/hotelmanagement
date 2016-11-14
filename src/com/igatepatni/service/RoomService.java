package com.igatepatni.service;

import java.util.ArrayList;
import java.util.List;

import com.igatepatni.bean.Rooms;
import com.igatepatni.dao.RoomDao;

public class RoomService {
	RoomDao roomDao=new RoomDao();
	
	public int deleteRooms(String roomNo) {
		return roomDao.deleteRooms(roomNo);
	}
	public ArrayList<Rooms> retrieveForModifyRoom(String roomNo) 
	{
		return roomDao.retrieveForModifyRoom(roomNo);
	}
	public int modifyRoom(Rooms room) 
	{
		
		return roomDao.modifyRoom(room);
	}
	public int addRooms(Rooms room) {
		
		return roomDao.addRooms(room);
	}
	public List<String> getRoomId(String roomId) {
		// TODO Auto-generated method stub
		return roomDao.getroomId(roomId);
	}
}
