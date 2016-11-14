package com.igatepatni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.igatepatni.dao.DBConnection;

public class ConnectionTest {

	@Test
	public void testConnection() {
		DBConnection connection = new DBConnection();
		assertNotNull(connection.getConnection());
	}

}
