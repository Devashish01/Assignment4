import java.util.Scanner;
class G
{
	void fun(int array[],int search)
	{
		int first = 0;
		  int last = array.length-1;
	int middle = (first+last)/2;
		 
		   while (first <= last) {
		      if (array[middle] < search)
		         first = middle + 1;    
		      else if (array[middle] == search) {
		         System.out.println("found at" + (middle+1));
		         break;
		      }
		      else
		         last = middle - 1;
		 
		      middle = (first + last)/2;
		   }
		   if (first > last)
		   System.out.println("not in array");
	}
	
}
public class Searching {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		G obj =new G();
		int[] arr= {1,4,6,7,8,9,10};
		System.out.println("Enter a number");
		int n=input.nextInt();
		obj.fun(arr,n);
		
		
		
		
		
		
	}

}

