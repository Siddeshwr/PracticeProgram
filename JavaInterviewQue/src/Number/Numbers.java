package Number;

public class Numbers {

	public static void main(String[] args)
	{
		Numbers num=new Numbers();
		num.Addition();
		num.CountNum();
		num.RevNumber();
		num.Fibonachi();
		num.ArmStrong();
		num.swapnumber();
		num.SwapNum();
		num.CheckEvenOdd();
		num.CheckPrimeNumber();

	}
	
	public void Addition()
	{
		int a[]= {1,5,7,19,23};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Addition of All Numbers is "+sum);
	}
	
	
	
	
	public void CountNum()
	{
		int a=1234567;
		
		int count=0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println("Total Numbers is "+count);
	}
       
	public void RevNumber()
	{
		int a=123456;
		int rev=0;
		while(a>0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println("Reverse is "+rev);
	}
	
	public void Fibonachi()
	{
		int a=0,b=1,c;
		
		for(int i=0;i<6;i++)
		{
		  c=a+b;
		  System.out.print(","+c);
		  a=b;
		  b=c;
		}}
	
	public void ArmStrong()
	{
		int num=371;
		
		int result,rem,sum=0;
		
		int temp=num;
		
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		System.out.println(" ");
		if(sum==num)
		{
			System.out.println(num+ " ArmStrong Number ");
		}
		else
		{
			System.out.println(num+" Not A ArmStrong Number");
		}
	}
	
	public void swapnumber()
	{
		int a=10;
		int b=20;
		
		int temp;
		System.out.println(a+" "+b+" Before Swap");
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b+" After Swap");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b+" Again After Swap");
	}
	
	
	public void SwapNum()
	{
		int a=7,b=5;
		System.out.println(a+" "+b+" Before Swap");
		a=a^b;
		//System.out.println(a);
		b=a^b;
		//System.out.println(b);
		a=a^b;
		System.out.println(a+" "+b+" After Swap");
	}
	
	public void CheckEvenOdd()
	{
		int a=12;
		
		if(a%2==0)
		{
			System.out.println(a+"is Even Number");
		}
		
		else
		{
			System.out.println(a+" Odd Number");
		}
	}
	
	
	public void CheckPrimeNumber()
	{
		int a=17;
		int temp=0;
		
		for(int i=0;i<a/2;i++)
		{
			if(a%2==0)
			{   temp=temp+1;
				break;
			}
		}
		if(temp==0)
		{
			System.out.println(a+" is a Prime Number");
		}
		else
		{
			System.out.println(a+" is  not a Prime Number");
		}
		
	}
}



