package one;

import java.util.Scanner;


public class Á·Ï° {
	
	public static int sum(int n,int m) {
	int sum=0;
	   for(int i=n;i<=m;i++)
		   sum+=i;
	   return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println(sum(1,10));
		System.out.println(sum(20,30));
		System.out.println(sum(35,45));
	}

}
