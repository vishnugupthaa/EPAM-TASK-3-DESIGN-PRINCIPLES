package EPAM.Calculate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MathsOperations {
	public void Calc() throws java.io.IOException
	{
		boolean next;
		do
		{
			Integer iFirstNumber=new Integer(0);
			Integer iSecondNumber=new Integer(0);
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter First Number: ");
			System.out.flush();
			try
			{
				iFirstNumber=Integer.parseInt(buffer.readLine());				
			}
			catch(NumberFormatException e)
			{
				System.out.println("***Please provide numeric values.***");
				System.exit(0);
			}

			System.out.println("Please enter the Operation (Add : +, Minus : -, Product : *, Divide : /):");
			System.out.flush();
			String option=buffer.readLine();

			System.out.println("Please enter Second Number: ");
			System.out.flush();

			try
			{
				iSecondNumber=Integer.parseInt(buffer.readLine(),10);
			}
			catch(NumberFormatException e)
			{
				System.out.println("***Please provide numeric values.***");
				System.exit(0);
			}
			
			if(option.length()==1)
			{
				Calculate c= new Calculate(iFirstNumber,option.charAt(0),iSecondNumber);
				c.doCalculation();
				c.getResult();
			}
			else
			{	
				System.out.println("***Operation Not Available. Please select any of the available options.***");
			}
			System.out.println("Would you like to calculate again (y/n)?");
			System.out.flush();
			char response=(char)buffer.read();
			if ((response=='y') || (response=='Y'))
			{
				next=false;
			}
			else
			{
				next=true;
			}
			
		}while (!next);
	}
}