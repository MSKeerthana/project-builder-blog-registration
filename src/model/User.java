package model;

import java.time.LocalDate;

public class User
{
	String name;
	int email;
	LocalDate date;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getemail()
	{
		return this.email;
	}
	public void setemail(int email)
	{
		this.email = email;
	}
	public LocalDate getdate()
	{
		return this.date;
	}
	public void setdate(LocalDate date)
	{
		this.date = date;
	}
	User(String name,int email,LocalDate date)
	{
		
	}
}

