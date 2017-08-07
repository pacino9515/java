package one;

import java.util.Scanner;

public class µ¥´Ê³¤¶È {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner in =new Scanner(System .in); 
 	String word=in.next();
 	boolean a=true;
 do{
	 if(word.indexOf(".")==-1)
	 	{
		 System.out.print(word.length()+" ");
		 word=in.next();
		 }
 	else{
 		System.out.print(word.length()-1);
 		a=false;
	 	}
 }while(a);
 }

}
