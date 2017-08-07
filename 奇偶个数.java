package one;

import java.util.Scanner;

public class ÆæÅ¼¸öÊı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System .in);
		
		int a = 0;
		int b = 0;
		int number;
		do{
		number=in.nextInt();
		if(number!=-1){
		if(number%2==0)
			a++;
		else
			b++;}
		}while(number!=-1);
		System .out.println(b+" "+a);
	}

}
