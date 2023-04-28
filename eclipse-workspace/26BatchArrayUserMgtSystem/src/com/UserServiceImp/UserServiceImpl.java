package com.UserServiceImp;
import java.util.Scanner;
import com.model.User;
import com.service.UserService;

public class UserServiceImpl implements UserService
{
	int max_size=10;
	User[] userArray=new User[max_size];
	Scanner sc=new Scanner(System.in);

	@Override
	public void AddUsers() 
	{
		System.out.println("Add User called........");
		System.out.println("How many users do you want to add");
		int number=sc.nextInt(); //n=2-0,1,2
		for (int i=0;i<number;i++)
		{
			User user=new User();

			System.out.println("Enter User Id");
			int id=sc.nextInt();
			user.setId(id);

			System.out.println("Enter User Name");
			String name=sc.next();
			user.setName(name);

			System.out.println("Enter User EmailId");
			String emailid=sc.next();
			user.setEmailId(emailid);
			userArray[i]=user;
		}


	}

	@Override
	public void DisplayUsers()
	{
		for(User user:userArray)
		{
			if(user!=null)
			{
				System.out.println(user);
			}
		}

	}

	@Override
	public void UpdateUsers()
	{
		System.out.println("Enter the user which user do u want update");
		int id=sc.nextInt();
		boolean flag=true;
		for(int i=0;i<userArray.length;i++)
		{
			User u=userArray[i];
			if(u!=null&&u.getId()==id)
			{
				do 
				{
					System.out.println("----update-----");
					System.out.println("1.update user id");
					System.out.println("2.update user name");
					System.out.println("3.update user email id");
					System.out.println("4.exit");
					System.out.println("Select field to update");
					int ch=sc.nextInt();
					switch(ch)
					{
					
					}

				}
				while(flag);
				break;
			}
		}


	}

	@Override
	public void DeleteUsers()
	{
		DisplayUsers();
		System.out.println("Enter the user number......Which user do u want to delete?");
		int num=sc.nextInt();//index location num=2 index 0,1
		userArray[num-1]=null;//so index 0,1 that one will be our 2nd index so 2-1=1 so 1th index data will get delete

	}

}
