package obd_application;




import java.io.*;
import java.util.Scanner;
public class ArrayPattern {

	

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=x ; i>0 ; i--) {
			for(int k=x ; k>i ; k--) {
				System.out.print(k);
			}
			for(int j=i; j>0 ; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
