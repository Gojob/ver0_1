package com.gojob.gui;

import java.io.BufferedReader;
import java.io.IOException;

import com.gojob.business.login.LoginBean;
import com.gojob.business.login.LoginController;

public class LoginUI {
	
	public static void menu(BufferedReader inp) throws IOException
	{
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
					
					if(lc.authenticate())
					{
						System.out.println("Logged in");
						printFirstPage();
						break;

					}
					else
					{
						System.out.println("Login failed");
						continue loop;
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

	private static void printFirstPage() {
		// TODO Post login page
		
	}
}
