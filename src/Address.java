package com.capgemini.spring.organization.address;

public class Address
{
	private String city;
	private String state;

	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}

	@Override
	public String toString()
	{
		return "city = " + city + "\nState = " + state;
	}
}