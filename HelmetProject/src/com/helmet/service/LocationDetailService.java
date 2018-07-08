package com.helmet.service;

import java.util.Date;
import java.util.List;

import com.helmet.entity.LocationDetail;

public interface LocationDetailService {

	public void addLocationDetails(LocationDetail locationDetail);
	
	
	public List<LocationDetail> listLocationDetail();
	
	
	public boolean updateLocationDetail(LocationDetail locationDetail);
	
	
	public void deleteLocationDetail(LocationDetail locationDetail);

	
	public LocationDetail getUserLocation(String mobileNo);
	
	
	public List<LocationDetail> listLocationDetailByDate(Date tripDate , String mobNo);

}
