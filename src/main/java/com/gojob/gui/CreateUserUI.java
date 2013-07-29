package com.gojob.gui;

import java.io.BufferedReader;

import com.gojob.business.login.LoginBean;
import com.gojob.business.login.LoginController;

public class CreateUserUI {

	public static void menu(BufferedReader inp) {
		String userInput = null;
		loop:while(true)
		{
			try
			{
				LoginBean loginBean = new LoginBean();
				System.out.println("Enter the following details");
				
				System.out.println("UserName[String]");
				loginBean.setUserName(inp.readLine());
				
				System.out.println("Password[String]");
				loginBean.setPassword(inp.readLine());
				
				CommonMenu.printCommonItem();
				userInput = inp.readLine();
				if(userInput.trim().equals("1"))
				{
					LoginController lc = new LoginController(loginBean);
					
					boolean successful = lc.createUser();
					if(successful)
					{
						System.out.println("User " + loginBean.getUserName() + " created");
						
						System.out.println("Please login");
						LoginUI.menu(inp);
					}
					else
					{
						System.out.println("Failed to create user");
					}
				}
				else if(userInput.trim().equals("2"))
				{
					continue loop;
				}
				else if (userInput.trim().equals("3"))
				{
					GUIMain.menu(inp);
				}
				else
				{
					System.out.println("Invalid input...reseting");
				}
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		
		
	}
	
	

	}
}
