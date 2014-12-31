package ProjectEular;

import java.io.*;
import java.util.Scanner;

public class traingle67 {
	
	public static void main(String [] args){
		
		Scanner input=new Scanner(System.in);
		//int test=input.nextInt();
		int rows=input.nextInt();
		int sum=0;
		int max_j=0;

		for(int i=0;i<rows;i++){
			int number[]=new int[i+1];
			
			for(int j=0;j<i+1;j++){	
				number[j]=input.nextInt();
				
				if(i==0 && j==0){
					sum=number[0];//include the 0th element in sum
					max_j=0;
					}
			}
			
			if(i!=0){
				
					int no1=number[max_j];
					int no2=number[max_j+1]; //System.out.println(no1 +" "+no2);
					if(no2>no1){
						sum=sum+no2;
						max_j=max_j+1;//System.out.println("max position"+max_j);
					}else sum=sum+no1;							
			}
		}System.out.println(sum);
	}
}
