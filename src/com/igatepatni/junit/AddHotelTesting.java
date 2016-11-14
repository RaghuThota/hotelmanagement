package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.bean.Hotel;
import com.igatepatni.dao.HotelDao;

public class AddHotelTesting {
	
	
	
	@Test
	public void testAddHotel()
	{
		System.out.println("in testing ");
		Hotel hotel = new Hotel();
		HotelDao hotelDao=new HotelDao();
	    assertEquals(1,hotelDao.addHotel(hotel));
	}

}
