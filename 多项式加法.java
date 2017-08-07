package one;

import java.awt.print.Printable;
import java.util.Scanner;

public class 多项式加法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] numbers=new int [10];
		int n=in.nextInt();
		int m=in.nextInt();
		int max=0;
		int a=0;
		while(n>=0){
		switch(n)
		{
		case 0:
			numbers[0]+=m;
			break;
		case 1:
			numbers[1]+=m;
			break;
		case 2:
			numbers[2]+=m;
			break;
		case 3:
			numbers[3]+=m;
			break;
		case 4:
			numbers[4]+=m;
			break;
		case 5:
			numbers[5]+=m;
			break;
		case 6:
			numbers[6]+=m;
			break;
		case 7:
			numbers[7]+=m;
			break;
		case 8:
			numbers[8]+=m;
			break;
		case 9:
			numbers[9]+=m;
			break;
			
		}
		n=in.nextInt();
		m=in.nextInt();
	}
		for(int i=numbers.length-1;i>=0;i--)
			if(numbers[i]!=0){
			if(i==0){
					System.out.print(numbers[i]);
			}
			else{
				if(i==1)
					System.out.print(numbers[i]+"x"+"+");
				else
				System.out.print(numbers[i]+"x"+i+"+");
			}
				}
			}
		}
	
//		for(int k=0;k<numbers.length;k++)
//			System.out.println(k+"+"+numbers[k]);
//		for(int j=1;j<numbers.length;j++)
//		
//		{
//		for(int i=0;i<numbers.length;i++)
//		{
//			if(numbers[i]>max)
//				{
//				max=numbers[i];
//				a=i;
//				}
//		}
////		System.out.println(max+"在第"+a);
//		numbers[a]=0;
//		
//		System.out.print(max+"x"+a+"+");
//		max=0;
//		}
////		System.out.println(numbers[a]);
//		
//		
//		
//		
//		
////	for(int j=0;numbers[j]>0;j++){
////		for(int i=0;i<numbers.length;i++){
////			if(numbers[i]>max){
////				max=numbers[i];
////				a=i;
////				}
////		}
////		System.out.println(a+"x"+max);
////		numbers[a]=0;
////		max=0;
//		      
//	}
//	}

