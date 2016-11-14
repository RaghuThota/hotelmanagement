package com.igatepatni.bean;

import java.io.Serializable;

public class Rooms implements Serializable{
	
	String roomId;
	String roomNo;
	String roomType;
	Double perNightRate;
	String availability;
	String hotelId;
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Double getPerNightRate() {
		return perNightRate;
	}
	public void setPerNightRate(Double perNightRate) {
		this.perNightRate = perNightRate;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	
	

}
