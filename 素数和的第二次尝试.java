package one;

import java.util.Scanner;

public class 素数和的第二次尝试 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int a=2;
		int b=0;
		int c=1;
		int sum=0;
		do
		{
		for(int i=2;i<a;i++)
			{
			if(a%i==0)
				b=1;
			}
		if(b==0){
			if(c>=n&&c<=m)
				{
				sum=sum+a;
				}
				c++;
				}
				a++;
				b=0;
		}while(c<=m);
		System.out.println(sum);
	}
}
