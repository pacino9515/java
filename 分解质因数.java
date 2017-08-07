package one;

import java.util.Scanner;

public class 分解质因数 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in)	;
	int [] numbers = new int [10000];
	Boolean apple =true;
	int a=in.nextInt();
	int b=0;
	
	System.out.print(a+"=");
	for(int j=2, k=0;j<=a;j++,apple=true)
	{
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
			{ 
				apple=false;
			}
		}
		if(apple)
		{
			numbers[k]=j;
//			System.out.println("第"+(k+1)+"个质数"+numbers[k]);
			k++;
		}
		
	}
	while(a!=0)
	{
		if(a%numbers[b]==0)
		{
			System.out.print(numbers[b]);
			a=a/numbers[b];
			{
				if(a!=1)
			{
					System.out.print("x");
						
			}
				else
					break;
			}
		}
		else
		b++;
	}
	}
	}


