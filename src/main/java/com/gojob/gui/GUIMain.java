package com.gojob.gui;

import gateway.UIGateway;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GUIMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		UIGateway.start();
		BufferedReader inp  = null;
		if(args[0] == "F")
		{
			inp = new BufferedReader (new FileReader("testLogin.txt"));
		}
		else
			inp = new BufferedReader (new InputStreamReader(System.in));
		menu(inp);
	}

	public static void menu(BufferedReader inp) throws IOException 
	{
		
		while(true)
		{
			printMenu();
			String userInput = inp.readLine();
			
			if(userInput.trim().equals("1"))
			{
				LoginUI.menu(inp);
			}
			else if(userInput.trim().equals("2"))
			{
				//ForgotPassword
			}
			else if(userInput.trim().equals("3")){
				CreateUserUI.menu(inp);
				
			}
			else if(userInput.trim().equals("q"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid input");
			}
			
		}
		
		
	}

	private static void printMenu() {
		
		System.out.println("Welcome to Gojob");
		System.out.println("1> Login");
		System.out.println("2> Forgot Password");
		System.out.println("3>Create a New Account");
		
	}

}
