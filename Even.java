import java.util.Scanner;
class B
{
	void fun(int a)
	{
		for(int i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
}
public class Even {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number");
		B obj =new B();
		int a=input.nextInt();
		obj.fun(a);
		
		
		
		
		
		
	}

}