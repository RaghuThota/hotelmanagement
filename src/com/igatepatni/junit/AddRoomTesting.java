package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.bean.Rooms;
import com.igatepatni.dao.RoomDao;

public class AddRoomTesting {
	
	@Test
	public void testAddRoom()
	{
		System.out.println("in testing");
		Rooms room=new Rooms();
		RoomDao roomDao=new RoomDao();
		assertEquals(1,roomDao.addRooms(room));
		
	}

}
