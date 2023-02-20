package Normal;

import java.util.Scanner;

public class demoss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of jobs");
		int n=sc.nextInt();int k=0;
		int[] arr=new int[n];
		System.out.println("enter the job starting time,end time,and earning");
		for(int i=1;i<=n*n;i++)
		{
			int value=sc.nextInt();
			if(i%3==0)
			{
				arr[k]=value;
				k++;
			}
		}
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		int same=arr[0];boolean a1=true;
		for(int i=0;i<arr.length;i++)
		{
			if(same==arr[i])
			{
				a1=false;
			}else {
				a1=true;
			}
		}
		int n1=arr.length-1;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=max)
			{
				sum=sum+arr[i];
			}
		}
		if(a1==false)
		{
			System.out.println("task"+n1);
			System.out.println("earning is:"+arr[0]);
		}
		else {
		System.out.println("task"+n1);
		System.out.println("earning is:"+sum);
		}
	}

}
