package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.dao.RoomDao;

public class DeleteRoomTesting {
	@Test
	public void testdeleteRoom()
	{
		RoomDao roomDao=new RoomDao();
		assertNotNull(roomDao.deleteRooms("44"));

}
}
