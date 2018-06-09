import java.util.Scanner;
import java.lang.Math;

class D
{
	int fun(int a)
	{
		int r=0;
		double sum=0,rem;
		int b=a;
		int c=a;
		while(b>0)
		{
			
			b=b/10;
			r++;
			
		}
		while(c>0)
		{
			rem=c%10;
			sum=sum+Math.pow(rem,r);
			c=c/10;
		}
		//System.out.println(sum);
		if(sum==a)
			return 1;
		else
			return 0;
		
	
	}
	
}
public class Armstrong {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number");
		D obj =new D();
		int a=input.nextInt();
		int r=obj.fun(a);
		if(r==1)
			System.out.println("Armstrong number");
		if(r==0)
			System.out.println("not a armstrong number");
		
		
		
		
		
	}

}