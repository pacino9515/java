package one;

import java.util.Scanner;

public class �¶ȱ任 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int UTC = in.nextInt();
		if(UTC/100>8)
		System.out.print(UTC/100-8);
		else
		System.out.print(UTC/100+16);
		if(UTC%100>9)
		System.out.print(UTC%100);
		else
		System.out.print("0"+UTC%100);
		
	}

}
