package EPAM.Calculate;

public class Calculate implements iCalci{
	private char Operator;
	private int  iFNum, iSNum;
		private Double dblResult=new Double(0);
		private int iResult=0;
		private boolean typeDouble=false;
		private boolean typeInt=false;
		public Calculate(int iFirstNum, char cOperator, int iSecondNum)
		{
			iFNum=iFirstNum;
			iSNum=iSecondNum;
			Operator=cOperator;
			typeInt=true;
		}
		public void doCalculation()
		{
			iResult=0;
			dblResult=0.0;
			
			switch (Operator)
			{
				case '+':
					checkInt();
					iResult = iFNum + iSNum;
					break;

				case '-':
					checkInt();
					iResult = iFNum - iSNum;
					break;

				case '*':
					checkInt();	
					iResult = iFNum * iSNum;
					break;

				case '/':
					checkInt();
					if(!checkSecondNum())
					{	
						iResult = iFNum / iSNum;
						break;
					}
					
				
				default :
					iResult=0;
					dblResult=0.0;
					System.out.println("***Operation Not Available. Please select any of the available options.***"); 
					break;
			}
		}
		public void getResult()
		{
			if(typeInt)
			{
				System.out.println("The result is: " + iResult);
			}
			else if(typeDouble)
			{
				System.out.println("The result is: " + dblResult);
			}
		}
		public boolean checkSecondNum()
		{
			if(iSNum==0) 
			{
				System.out.println("Zero Not allowed");
				System.exit(0);
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public void checkInt()
		{
			if(!typeInt) 
			{
				iResult=0;
				System.out.println("***Operation Not Available. Please select any of the available options.***"); 
				System.exit(0);
			}
		}

		public void checkDouble()
		{
			if(!typeDouble) 
			{
				dblResult=0.0;
				System.out.println("***Operation Not Available. Please select any of the available options.***"); 
				System.exit(0);
			}
		}
	}
