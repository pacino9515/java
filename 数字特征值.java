package one;

import java.util.Scanner;

public class Êı×ÖÌØÕ÷Öµ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		int sum=0;
		int number=in.nextInt();
		do{
		a=number%10;
		b++;
		if(a%2==0)
			c=2;
		else
			c=1;
		if((b+c)%2==0)
			sum=(int) (sum+Math.pow(2.0, b-1));
		number=number/10;}
		while(number>0);
		System.out.println(sum);
	}

}
