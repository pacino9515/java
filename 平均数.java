package one;

import java.util.Scanner;

public class 平均数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System .in);
		int sum ; 
		sum=0;
		double n = -1;
		int a =0;
		int b;
		while(a!=-1)
		{
			sum=sum+a;
			n++;
			a =in.nextInt();
		;
		}
		System.out.println("平均值为："+sum/n);
	}

}
