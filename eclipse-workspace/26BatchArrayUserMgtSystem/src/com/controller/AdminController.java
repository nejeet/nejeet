package com.controller;
import java.util.*;

import com.UserServiceImp.UserServiceImpl;
import com.service.UserService;

public class AdminController {

	public static void main(String[] args) 
	{
		System.out.println("User Management Application Started");
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		UserService us=new UserServiceImpl();
		do
		{
			System.out.println("-----Menu-----");
			System.out.println("1.Add Users");
			System.out.println("2.Display User Details");
			System.out.println("3.Update User Profile");
			System.out.println("4.Delete User Details");
			System.out.println("5.Exit the application");


			System.out.println("Select Any Option");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				us.AddUsers();
				break;
			case 2:
				us.DisplayUsers();
				break;
			case 3:
				us.UpdateUsers();
				break;
			case 4:
				us.DeleteUsers();
				break;
			case 5:
				System.out.println("User wants to exit");
				flag=false;
				break;
			default:
				System.out.println("Invalide choice....Choose correct number");
				break;
			}
		}


		while(flag);

		sc.close();
		System.out.println("User Managment Application stopped");



	}

}
