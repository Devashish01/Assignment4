import java.util.Scanner;
class E
{
	
	void fun(int a)
	{
		int c=a,rem=0;
		while(c>0)
		{
			rem=c%10;
			c=c/10;
			System.out.print(rem);
		}
	}
}
public class Reverse {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number");
		E obj =new E();
		int a=input.nextInt();
		obj.fun(a);
		
		
		
		
		
		
	}

}