package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.dao.HotelDao;

public class RetrieveForModifyTesting {

	@Test
	public void testretrieve()
	{
		HotelDao hotelDao=new HotelDao();
		assertNotNull(hotelDao.retrieveForModify("hotel"));
	}
}
