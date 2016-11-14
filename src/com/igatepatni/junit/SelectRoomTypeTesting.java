package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.bean.Rooms;
import com.igatepatni.dao.HotelDao;

public class SelectRoomTypeTesting {
	@Test
	public void testSelectRoomType()
	{
		Rooms room=new Rooms();
		HotelDao hotelDao=new HotelDao();
		assertNotNull(hotelDao.selectRoomType(room));
	}

}
