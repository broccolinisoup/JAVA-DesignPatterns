package com.broccolinisoup.dp.dependencyInjection.InterfaceAndService;

public class Demo {

	public static void main(String[] args) {
		GetDress gettingDress = new GetYogaDress();
		GettingDressService service = new GettingDressService(gettingDress);
		service.goOut();

	}

}
