package ProjectEular;

import java.util.Scanner;

public class LargestPrimefactor {
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int test=input.nextInt();
		long array1[]=new long[test];
		for(int i=0;i<test;i++)array1[i]=input.nextLong();
		
		for(int i=0;i<test;i++){
			if(array1[i]>10000000)System.out.println(primeLargelong(array1[i]));
			else System.out.println(primeLarge(array1[i]));
		}
		
	}
	/*public static long primeLarge(long number){
		long prime=0,fact=0;
		for(int j=(int) number;j>2;j--){
			if(number%j==0){
				fact=j;
				for(int i=2;i<j;i++){
					if(j!=i && j%i==0)continue;					
				}
			}
		}
		return fact;	
	}*/
	
	public static int primeLarge(long number){
		
		int array[]=new int[(int) (number+1)];
		
		for(int i=2;i<=number;i++)array[i]=0;
		
		for(int i=2;i*i<=number;i++){
			if(array[i]==0){
				for(int j=i;i*j<=number;j++){
					array[i*j]=1;
				}
			}
		}
		for(int i=(int) number;i>=2;i--){
			if(array[i]==0 && number%i==0){
				return i;
			}
		}
		return 0;
		
		
	}
	public static long primeLargelong(long number){
		long i,fact=0;
		for(i=2;i*i<=number;i++){
			if(number%i==0){
				fact=i;
				number=number/i;
			}
		}
		if(number>1){
			if(fact<number)fact=number;
		}
		return fact;
		
	}
}
