import java.util.Scanner;
class C
{
	void fun(int a)
	{	int count;
		 for(int i=1; i<=a; i++)
		    {
		        count=0;
		        for(int j=1; j<=a; j++)
		        {
		            if(i%j==0)
		                count++;
		        }
		        if(count==2)
		           System.out.println(i);
		    }
		
		
	}
	
}
public class Rprime {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number");
		C obj =new C();
		int a=input.nextInt();
		obj.fun(a);
		
		
		
		
		
		
	}

}