
	/**
	@Title:		LastNameFirstNameCarSalesCommission
	@Purpose:	To practice java loop and conditional statements.
	@Author:    	(Matthews Devyn)
	@Date:   	(today’s date)
	@Version:	1.0
	*/


import  java.util.Scanner;

	public class MatthewsDevynCarSalesCommission{

	public static void main (String [] args){


		char name;
		int Salary = 3000;
		int Sudan;
		int ST;
		int Truck;
		int TT;
		int SUV;
		int SUT;
		int Com1S = 80; int Com2S= 120; int Com3S= 160;
		int Com1T = 100; int Com2T=140;  int Com3T=180;
		int Com1SU =100; int Com2SU= 150; int Com3SU=200;
		int Total;
String again;
	Scanner keyboard = new Scanner(System.in);

	System.out.println("What's your name?");
	name= keyboard.next().charAt(0);


do{System.out.println("How many Sudan car have been sold?");
	Sudan = keyboard.nextInt();

	if( Sudan <= 10)
	{
		ST= Com1S*Sudan;
		System.out.print("Your commision earn is $" + ST);
}
	if( Sudan >= 11 && Sudan <= 20)
		{
			ST= Com1S + Com2S*Sudan;
		System.out.print("Your commision earn $" + ST);

}
System.out.println("\n\nHow many Trucks have been sold");
Truck=  keyboard.nextInt();
	if( Truck <= 10)
		{
			TT= Com1T*Truck;
			System.out.print("Your commision earn is $" + TT);
}

System.out.println("\n\nHow many SUV have been sold");
SUV=  keyboard.nextInt();
if( SUV <= 10)
	{
		SUT= Com1SU*SUV;
		System.out.println("Your commision earn is $" + SUT);
	Total= SUT;
System.out.println("Your total Salary is $"+(Salary+Total));
}
System.out.println("Want to try again? y or n");
again=keyboard.next();
}
while(again.equals("y"));
}
}

