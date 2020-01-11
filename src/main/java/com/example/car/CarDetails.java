package com.example.car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;
@Repository
public class CarDetails {
	public static Map<Integer,Car> m=new HashMap<>();
	{
	m.put(1,new Car(1,"Audi","AUDIQ2"));
	m.put(2,new Car(2,"Honda","Amaze"));
	m.put(3,new Car(3,"BMW","BMW X6"));
	m.put(4,new Car(4,"Mercedes","G-clss"));
	}
	public List<Car> getall()
	{
		List<Car>l=m.values().stream().collect(Collectors.toList());
		return l;
		
	}
	public static Car insertall(Car car)
	{
		m.put(car.getId(), car);
		return car;
	}
	public static Car delete(Car car)
	{
		m.remove(car.getId(), car);
		return car;
	}
	public static Car update(Car car)
	{
		m.replace(car.getId(), car);
		return car;
	}
	

}

