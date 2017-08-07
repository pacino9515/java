package one;

import java.util.Scanner;

public class Á·Ï°2 {
	
	public static int Fid(int N){
		int a=0;
	int []  Fid=new int [N+1];
	Fid[1]=Fid[0]=1;
	Fid[N]= Fid[N-1]+Fid[N-2];
	a=Fid[N];
	return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int N =in.nextInt();
		System.out.println(Fid(N));
		
		}
	}


