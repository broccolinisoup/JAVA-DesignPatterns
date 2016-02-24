package com.broccolinisoup.dp.dependencyInjection.InterfaceAndService;

public class GettingDressService {
	
	public GetDress getDress;
	
	public GettingDressService(GetDress getDress){
		this.getDress = getDress;
		
	}
	
	public void goOut(){
		getDress.getDress();
		
	}

}
