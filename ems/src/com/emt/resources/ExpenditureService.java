package com.emt.resources;

import java.util.ArrayList;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;



@Path("/")


public class ExpenditureService {	
	
	@GET
	@Path("expenditure/xml")
	@Produces(MediaType.APPLICATION_XML)	
	public Expenditure getExpenditureInXml()
	{
		
		System.out.println("Executed@@@@@@@@@@@@@@@@@@@@@@@");
		
	
		
		Expenditure e=new Expenditure();
		e.setExpItemName("potato");
		e.setExpPrice("RS 100");
		//e.setUser(ud); 
		
		return e;
		//return new Expenditure();
	}
	
	@GET
	@Path("expenditure/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public String  getExpenditureInJson()
	{
		
		System.out.println("Executed@@@@@@@@@@@@@@@@@@@@@@@");
		List<Expenditure> list=new ArrayList<Expenditure>();
		
		Expenditure e=new Expenditure();
		e.setExpItemName("potato");
		e.setExpPrice("RS 100");
		list.add(e);
		e.setExpItemName("Stalin");
		e.setExpPrice("RS 100");
		list.add(e);
		
		
		
		
		return new Gson().toJson(list);
		//return new Expenditure();
	}

}
