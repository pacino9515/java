package one;

import java.util.Scanner;

public class ÍêÊı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int a=0;
		
		for(int i=n,sum=0;i<m;i++,sum=0)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				sum+=j;
			}
			if(i==sum)
			{
				if(a==0)
				{
					System.out.print(i);
					a++;
				}
				else
					System.out.print(" "+i);
			}
		}
	}

}
