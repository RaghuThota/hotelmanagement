package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.dao.HotelDao;

public class GetHotelIdTesting {
	@Test
	public void testGetHotelId()
	{
		HotelDao hotelDao=new HotelDao();
		assertNotNull(hotelDao.gethotelId());
	}

}
