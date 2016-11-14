package com.igatepatni.junit;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.igatepatni.bean.Booking;

import com.igatepatni.dao.HotelDao;

public class BookRomForUserTesting {
	
	@Test
	public void testbooking()
	{
		Booking book=new Booking();
		HotelDao hotelDao=new HotelDao();
		assertNotNull(hotelDao.bookRoomForUser(book));
	}

}
