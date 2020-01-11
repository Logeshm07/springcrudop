package com.example.car;

public class Car 
{
	private int id;
	private String carName;
	private String company;
	Car(int id,String carName,String company)
	{
		this.id=id;
		this.carName=carName;
		this.company=company;
		}       
	public int getId()
	{
		return id;
	}
	public String getCarName()
	{
		return carName;
	}
	public String getcompany()
	{
		return company;
	}
	public String toString()
	{
		System.out.println("i am  toString");
		return "id :"+ id + "Car name "+ carName +"company name:"+ company;
	}

}
