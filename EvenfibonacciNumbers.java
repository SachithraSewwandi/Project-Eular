package ProjectEular;

import java.math.BigInteger;
import java.util.Scanner;

public class EvenfibonacciNumbers {
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int test=input.nextInt();
		long array[]=new long[test];
		for(int i=0;i<test;i++) array[i]=input.nextInt();
		
		for(int i=0;i<test;i++){
				System.out.println(fib_big(array[i]));
		}
			
	}
	public static int fib_big(long array) { 
		BigInteger a, b, fib;
		int sum=0;
		a   = new BigInteger("1"); //big ints are objects
		b   = new BigInteger("1");
		fib = new BigInteger("1"); 

		int i=0;
		while(fib.intValue()<array){ 
		    fib = a.add(b); 
		    a = b; 
		    b = fib; //System.out.println(fib);
		    i++;
		    if(fib.intValue()%2==0 && fib.intValue()<array )sum=sum+fib.intValue();
		}
		return sum; 
	    }	
}
