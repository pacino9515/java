package one;

import java.util.Scanner;

public class 念整数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int a=0;
		int b=n;
		int c=1;
		int i=1;
		if(n<0){
			System.out.print("fu ");
			n=-n;
			b=-b;
		}
		while(n>0){
			n=n/10;
			a++;}
//			System.out.println(a+"位数");
//			for(int i=1;i<=a;i++)
			while(i<=a){
				c=b/(int)Math.pow(10, a-i) ;
				b=b-c*((int)Math.pow(10, a-i) );
			
			switch(c){
				
				case 1:
					System.out.print("yi");
				break;
				case 2:
					System.out.print("er");
				break;
				case 3:
					System.out.print("san");
				break;
				case 4:
					System.out.print("si");
				break;
				case 5:
					System.out.print("wu");
				break;
				case 6:
					System.out.print("liu");
				break;
				case 7:
					System.out.print("qi");
				break;
				case 8:
					System.out.print("ba");
				break;
				case 9:
					System.out.print("jiu");
				break;
				case 0:
					System.out.print("ling");
				break;
				
				}
				if(i<a){
					System.out.print(" ");
				}
				i++;
			}
			
	}

}
