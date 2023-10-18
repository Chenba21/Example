package Main;

import interface1.MyCalc;
/*class  DemoCalc implements MyCalc
{
	public void show()
	{
		System.out.println("Am inside the DemoCalc");
	}
}*/
public class Calc
{
	public static void main(String[] args)
	{
		MyCalc dc=()-> System.out.println("Am inside the DemoCalc");
		dc.show();
		
	}
}
/*
 * public static void main(String[] args)
	{
		MyCalc dc= ()-> //This parameter can have  whatever the parameters u have it in method parameter
		{
			System.out.println("Am inside the DemoCalc");//This can have multiple statements
		};
		dc.show();
 */
