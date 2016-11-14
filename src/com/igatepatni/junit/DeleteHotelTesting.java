package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.bean.Hotel;
import com.igatepatni.dao.HotelDao;

public class DeleteHotelTesting {
@Test
public void testDeleteHotel()
{
	Hotel hotel = new Hotel();
	HotelDao hotelDao = new HotelDao();
	assertNotNull(hotelDao.deleteHotel("45"));
}

}
