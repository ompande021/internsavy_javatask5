package calaculator;

import java.util.Scanner;

public class CalculatorDrive implements CalculatorOperation {
	
	static double a;
	static double b;
	
	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        boolean exit = true;
		while(exit)
		{
			System.out.print("Enter the first number: ");
			double a = s1.nextDouble();
			System.out.print("Enter the second number: ");
			double b = s1.nextDouble();
        
			CalculatorDrive cl = new CalculatorDrive();
        
			System.out.println("Choose an operation:\n1. Addition (+) \n2. Subtraction (-) \n3. Multiplication (x) \n4. Division (/) \n5. Percentage (%)");

			int ch = s1.nextInt();
			double res;

			switch (ch) {
				case 1:
					res = cl.plus(a, b);
					System.out.println("------------");
					System.out.println(a+" + " +b+"\n"+"= " +res+"\n");
					break;
				case 2:
					res = cl.minus(a, b);
					System.out.println("------------");
					System.out.println(a+" - "+b+"\n"+"= " +res+"\n");
					break;
				case 3:
					res = cl.multiplication(a, b);
					System.out.println("------------");
					System.out.println(a+" x "+b+"\n"+"= " +res+"\n");
					break;
				case 4:
					res = cl.division(a, b);
					System.out.println("------------");
					System.out.println(a+" / "+b+"\n"+"= "+res+"\n");
					break;
				case 5:
					res = cl.persentage(a, b);
					System.out.println("------------");
					System.out.println(a+" % "+b+"\n"+"= "+res+"\n");
					break;
				default:
					System.out.println("Invalid choice!");
					return;
			}
			System.out.println("1. Continue calculating\n2. Exit");
			int z= s1.nextInt();
			if(z==2)
			{
				exit=false;
			}
		}
	}

    public double plus(double n1, double n2)
    {
    	return n1 + n2;
    }
	
	public double minus(double n1, double n2)
	{
		return n1 - n2;
	}
	
	public double multiplication(double n1, double n2)
	{
		return n1 * n2;
	}
	
	public double division(double n1, double n2)
	{
		if(n2==0)
		{
			System.out.println("The no.cannot divide by zero!");
			return 0;
		}
		else
		{
			return n1/n2;
		}
		
	}
	
	public double persentage (double n1, double n2)
	{
		 return (n1 * n2) / 100.0;
	}
}
