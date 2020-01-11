package com.example.car;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Carcon {
	@Autowired
	CarDetails cd;
	@RequestMapping(value="/get")
	public List<Car> get()
	{
		return cd.getall();
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public static Car insert(@RequestBody Car cc)
	{
		return CarDetails.insertall(cc);
	}
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public static Car delete(@RequestBody Car cc)
	{
	return CarDetails.delete(cc);
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public static Car update(@RequestBody Car cc)
	{
		return CarDetails.update(cc);
	}
	
	
}
