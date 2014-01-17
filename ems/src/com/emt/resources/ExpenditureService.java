package com.emt.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;



@Path("/")


public class ExpenditureService {	
	
	
	@GET
	@Path("userexpence/daily/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public String  getUserExpenceDaily()
	{
		
		System.out.println("Executed@@@@@@@@@@@@@@@@@@@@@@@");
		List<UserExpenceDaily> list=new ArrayList<>();
		
		UserExpenceDaily e=new UserExpenceDaily();
		e.setNo(1);
		e.setName("Sunil");
		e.setPrice(100);
		list.add(e);
		e=new UserExpenceDaily();
		e.setNo(2);
		e.setName("Stalin");
		e.setPrice(200);
		list.add(e);	
		e=new UserExpenceDaily();
		e.setNo(3);
		e.setName("Sada");
		e.setPrice(200);
		list.add(e);	
		
		return new Gson().toJson(list);
		//return new Expenditure();
	}
	
	@GET
	@Path("userexpence/monthly/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public String  getUserExpenceMonthly()
	{
		
		System.out.println("poo");
		List<UserExpenceMonthly> list=new ArrayList<UserExpenceMonthly>();
		
		UserExpenceMonthly e=new UserExpenceMonthly();
		e.setNo(1);
		e.setName("Sunil");
		e.setPrice(100);
		list.add(e);
		e=new UserExpenceMonthly();
		e.setNo(2);
		e.setName("Stalin");
		e.setPrice(200);
		list.add(e);	
		e=new UserExpenceMonthly();
		e.setNo(3);
		e.setName("Sada");
		e.setPrice(200);
		list.add(e);	
		
		
		
		return new Gson().toJson(list);
		//return new Expenditure();
	}
	
	@GET
	@Path("messexpence/daily/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public String  getMessExpenceDaily()
	{
		
		System.out.println("Executed@@@@@@@@@@@@@@@@@@@@@@@");
		List<MessExpenceDaily> list=new ArrayList<>();
		
		MessExpenceDaily e=new MessExpenceDaily();
		e.setNo(1);
		e.setDate(new Date());
		e.setPrice(100);
		list.add(e);
		e=new MessExpenceDaily();
		e.setNo(2);
		e.setDate(new Date());
		e.setPrice(200);
		list.add(e);	
		e=new MessExpenceDaily();
		e.setNo(3);
		e.setDate(new Date());
		e.setPrice(200);
		list.add(e);	
		
		return new Gson().toJson(list);
		//return new Expenditure();
	}
	
	@GET
	@Path("messexpence/monthly/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public String  getMessExpenceMonthly()
	{
		
		System.out.println("Executed@@@@@@@@@@@@@@@@@@@@@@@");
		List<MessExpenceMonthly> list=new ArrayList<>();
		
		MessExpenceMonthly e=new MessExpenceMonthly();
		e.setNo(1);
		e.setMonth("Jan");
		e.setPrice(100);
		list.add(e);
		e=new MessExpenceMonthly();
		e.setNo(2);
		e.setMonth("Feb");
		e.setPrice(200);
		list.add(e);	
		e=new MessExpenceMonthly();
		e.setNo(3);
		e.setMonth("Mar");
		e.setPrice(200);
		list.add(e);	
		
		return new Gson().toJson(list);
		//return new Expenditure();
	}
	
	//--------------------------------------------------------------------------------------------------------------------

	@GET
	@Path("expenditure/xml")
	@Produces(MediaType.APPLICATION_XML)	
	public Expenditure getExpenditureInXml()
	{
		
		System.out.println("Executed@@@@@@@@@@@@@@@@@@@@@@@");
		
	
		
		Expenditure e=new Expenditure();
		e.setSpender("Sunil");
		e.setItemPrice(100);
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
		e.setSpender("Sunil");
		e.setItemPrice(100);
		list.add(e);
		e.setSpender("Stalin");
		e.setItemPrice(200);
		list.add(e);		
		
		return new Gson().toJson(list);
		//return new Expenditure();
	}
	
}
