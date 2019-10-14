package morgan;

import java.util.Scanner;

public class LEDChanges {

	public static void main(String[] args) {
		int a[]=new int[] {6,2,5,5,4,5,5,3,7,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String input=sc.next();
		int len=input.length();
		int x=0,flag=0,sum=0,prev=0;;
		char digitc[]=input.toCharArray();
		int digits[]=new int[len];
		//System.out.println("length :"+len);
		int num=Integer.parseInt(input);
		//System.out.println("Intger form "+num);
		if(digitc[0]=='0') 
			digits[0]=0;
		 while(num>0){ 
			 digits[len-x-1]=num%10; 
			 num=num/10;
		     //System.out.println(digits[len-x-1]);
		     x++; 
		  } 
		 
		 for(int i=0;i<digits.length;i++)
		 {
			 if(flag==0)
			 {
				 sum=sum+a[digits[i]];
				 flag=1;
				 prev=a[digits[i]];
			 }
			 else
			 {
				 if(prev-a[digits[i]]<0)
				 {
					 sum=sum-(prev-a[digits[i]]);
					 prev=a[digits[i]];
				 }
				 else
				 {
					 sum=sum+(prev-a[digits[i]]);
					 prev=a[digits[i]];
				 }
			 }
		 }
		 System.out.println("Answer : "+sum);
		 
	}

}
