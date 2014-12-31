package ProjectEular;

import java.util.Scanner;

public class Multiplesof3and5 {
	public static void main(String[] args){
		
		//inputs
		Scanner input=new Scanner(System.in);
		int test=input.nextInt();
		int array[]=new int[test];
		for(int i=0;i<test;i++)array[i]=input.nextInt();
			
		
		
		for(int i=0;i<test;i++){
			long sum1=0,sum2=0,sum3=0,sum=0;//System.out.println(array[i]);
			long no3=0,no5=0,no15=0;
			no3=(array[i]-1)/3;
			no5=(array[i]-1)/5;
			no15=(array[i]-1)/15;
			
			sum1=no3*(6+(no3-1)*3)/2 ;//System.out.println(sum1);
			sum2=no5*(10+(no5-1)*5)/2;//System.out.println(sum2);
			sum3=no15*(30+(no15-1)*15)/2;//System.out.println(sum3);
			sum=sum1+sum2-sum3;
			
			System.out.println(sum);
		}
			
	}
	}

