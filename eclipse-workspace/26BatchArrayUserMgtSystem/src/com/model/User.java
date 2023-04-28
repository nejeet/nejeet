package com.model;

public class User
{
	private String name;
    private int id;
    private String emailId;
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getEmailId()
	{
		return emailId;
	}
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
//	public String toString()
//	{
//		return id+" "+name+" "+emailId;
//	}
	@Override
	public String toString() 
	{
		return "User [name=" + name + ", id=" + id + ", emailId=" + emailId + "]";
	}

}
